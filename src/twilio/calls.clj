(ns twilio.calls
  (:require [twilio.core :as twilio]
            [cheshire.core :as json]))


(defn make-call
  "Call to number
    call is a map with the following mandatory keys:
    - From
    - To
    - Url or ApplicationSid
    Visit https://www.twilio.com/docs/api/rest/making-calls to see some optional keys for call map.
    Call, sid and token are mandatory params.
  "
  [call sid token]
  (let [url (twilio/make-request-url "Calls" sid)
        resp (twilio/request :post url sid token call)
        body (json/parse-string (:body resp) true)]
    body))