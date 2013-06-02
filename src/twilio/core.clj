(ns twilio.core
  (:require [clj-http.client :as client]
            [cheshire.core :as json]))

(def base "https://api.twilio.com/2010-04-01")

(defn make-request-url [endpoint sid]
  (format
    "%s/Accounts/%s/%s.json"
    base
    sid
    endpoint ))

(defn request
  "Make a generic HTTP request"
  [method url sid token & params]
  (try
    (let [f (condp = method
              :post client/post
              :else client/get)]
    (f url
      {:accept :json
       :form-params (first params)
       :basic-auth [sid token]}))
  (catch Exception e
     (let [exception-info (.getData e)]
     (select-keys
       (into {} (map (fn [[k v]] [(keyword k) v])
         (json/parse-string
             (get-in exception-info [:object :body]))))
             (vector :status :message :code))))))

