(ns twilio.sms
  (refer-clojure :exclude [send])
  (:require [twilio.core :as twilio]))


(defn send
  "Send an SMS message
    msg is a map with the following keys
    - From
    - To
    - Body
   Msg, sid and token are mandatory params.
  "
  [msg sid token]
  (let [url (twilio/make-request-url "SMS/Messages" sid)]
    (twilio/request :post url sid token msg)))