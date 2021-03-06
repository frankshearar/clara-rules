(ns clara.rules.testfacts)

;; Reflection against records requires them to be compiled AOT, so we temporarily
;; place them here as leiningen won't AOT compile test resources.
(defrecord Temperature [temperature location])
(defrecord WindSpeed [windspeed location])
(defrecord Cold [temperature])
(defrecord ColdAndWindy [temperature windspeed])
(defrecord LousyWeather [])

;; Test facts for chained rules.
(defrecord First [])
(defrecord Second [])
(defrecord Third [])
(defrecord Fourth [])