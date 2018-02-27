(sort-by str '[G F E S G H A V F B B])

(def tree '[Q [R G [S F E]] D])

(defn root [tree] (first tree))
(def parent root)

(defn has-children?
  [tree]
  (= (count tree) 3))

(defn left-child [tree]
  (if (has-children? tree)
    (nth tree 1) nil))

(defn right-child [tree]
  (if (has-children? tree)
    (nth tree 2) nil))

(defn order-if [tree newTree]
  (if (empty? tree)
    nil
    (if (left-child tree)
      (tree)

      )

    ))


(def example '[U [S H [T G F]]])

;; returns first inner vector that does not contain other vectors
(defn inner-vector
  [v]
  (when (vector? v)
    (if (not (some vector? v)) v (some inner-vector v))))

(inner-vector (sort-by str example)) ;; [T G F]

;; all vectors (root + inner vectors)
(filter vector?
        (tree-seq vector? identity example))

(sort-by str (filter vector?
                     (tree-seq vector? identity example)))
;; ([U [S H [T G F]]] [S H [T G F]] [T G F])