(defn order-if [tree compar]
  (cond
    (= compar 'alphabetic-less-than)
    (alphabetic-less-than tree)
    (= compar 'alphabetic-more-than)
    (alphabetic-more-than tree)
    :else
    'unavailable_comparator
    ))

(defn has-children?
  [tree]
  (> (count tree) 1))

(defn alphabetic-less-than [tree]
  (empty? tree)
  nil
  (let [(first tree) newTree])
  (cons (first tree) newTree)
  (sort-by str (rest tree)))




[Q [R G [S F E]] D]
