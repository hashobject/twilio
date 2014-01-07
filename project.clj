(defproject twilio "0.1.1"
  :description "A Clojure library for interaction with Twilio REST API."
  :signing {:gpg-key "Hashobject Ltd <team@hashobject.com>"}
  :url "https://github.com/hashobject/twilio"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [clj-http "0.7.8"]
                 [cheshire "5.3.0"]])
