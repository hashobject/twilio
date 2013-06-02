(defproject twilio "0.1.0"
  :description "A Clojure library for interaction with Twilio REST API."
  :signing {:gpg-key "HashObject Ltd <team@hashobject.com>"}
  :url "https://github.com/hashobject/twilio"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [clj-http "0.7.2"]
                 [cheshire "5.0.1"]])
