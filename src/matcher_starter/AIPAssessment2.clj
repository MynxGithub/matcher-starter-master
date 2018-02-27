; Function we found called sort-by str. Sorts the strings in alphabetical order.
; I doesnt work for sub vectors
(sort-by str '[G F E S G H A V F B B])

; A tree structure that we where given in our problem
(def tree '[Q [R G [S F E]] D])

(def tree2 '[P [T [R G [S F E]] D] [Q C [V B A] [X G E K]] A C [D F E]])

(defn root [tree]
  (first tree))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

; vect-sort function identifies if i is a sequence, if so it gets the first. Otherwise it gets the rest
(defn vect-sort [x]
      (if (symbol? x)
        x
        (first x)))

(defn sort-level [tree]
  (into [] (cons (first tree) (sort-by vect-sort (rest tree)))))

(defn sort-tree [tree]
  (cond (empty? tree)
        tree
        (vector? tree)
        (sort-tree (rest tree))))

; (vect-sort '[Q [R G [S F E]] D]
; => [Q [R G [S F E]] D]

; (vect-sort '[W G D V G])
; => [W G D V G]

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

; vect-sort function identifies if i is a sequence, if so it gets the first. Otherwise it gets the rest
(defn vect-sort2 [x]
  (if (seq x)
    (first x)
    x))

;(vect-sort2 '[Q [R G [S F E]] D]
; => Q

;vect-sort2 '[R G [S F E] D]
; => R

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

; A helper function for bubble-sort
; Pop returns a new vector without the last element
; Pop's off el and adds it on
(defn sort-elements [el x]
  (if-let [y (last el)]
    (if (neg? (compare x y))
      (conj (pop el) x y)
      (conj el x))
    [x]))

(defn bubble-sort [tree]
  (let [el (reduce sort-elements [] tree)]
    (if (zero? (compare tree el))
      tree
      (recur el))))

; (bubble-sort '[Q F X S G C S A F S C G]
; => [A C C F F G G Q S S S X]

; Believe the exception is becuase it's expecting a symbol, but it is being passed a subvector. Unsure how to fix this.
; (bubble-sort '[Q [R G [S F E]] D])
; => ClassCastException clojure.lang.Symbol cannot be cast to clojure.lang.IPersistentVector  clojure.lang.APersistentVector.compareTo (APersistentVector.java:430)

(defn alphabetic-less-than [tree]
  (if (empty? tree)
    nil
    (if ())
    ))

; bubble-sort could work
; sort-by str is a good way
; vect-sort is needed to compare the first element of each subtree
; could use a map :D [] :F[...]


;(defn tree? [t]
;  (and (seq? t) (not (empty? t))))

