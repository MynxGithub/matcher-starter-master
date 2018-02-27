;(def tree '[F E [E B [D C [B A] A] C]])
(def tree '[Q [R G [S F E]] D])

(defn remove-parent [tree]
  (into [] (rest tree)))

(defn add-parent [tree newtree]
  (into [] (cons (first tree) newtree)))

(defn branch-num [tree]
  (dec (count tree)))

;;(dotimes [n count] (expression))

(defn alphabetic-less-than [tree newtree]
  ;;(let [newtree (add-parent tree newtree)])
  ;;(let [tree2 (remove-parent tree)])

  (dotimes [n (branch-num (remove-parent tree))]) (alphabetic-less-than (rest tree) (newtree)))

(defn alphabetic-less-than [tree newtree]
  (if (empty? tree)
    nil
    (cons (sort-by str (alphabetic-less-than (remove-parent tree) tree)) newtree)
    )
  )

(defn alphabetic-less-than [tree]
  (let [nodeA (first tree)] nodeA)
  (let [nodeB (first (next tree))] nodeB)
  (compare 'nodeA 'nodeB)
  (alphabetic-less-than (rest tree)))

(defn order-if [tree comp]

  )





















