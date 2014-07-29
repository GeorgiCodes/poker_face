(ns poker-face.core
  (:require [clojure.math.combinatorics :as combo]))

(defrecord Card [rank suit])

(def ranks #{:two :three :four :five :six :seven :eight :nine :ten :jack :queen :king :ace})
(def suits #{:spades :clubs :diamonds :hearts})
(def deck (combo/cartesian-product suits ranks))



;; testing
(def single-card (Card. (:three ranks) (:spades suits)))
(:rank single-card)
(:three ranks)
