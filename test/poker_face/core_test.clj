(ns poker-face.core-test
  (:require [clojure.test :refer :all]
            [poker-face.core :refer :all]))

(deftest deck-size-test
  (testing "Deck size"
    (is (= 52 (count deck)))))
