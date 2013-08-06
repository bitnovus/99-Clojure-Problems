;;;; Flatten a nested list structure.
;;;; Transform a list, possibly holding lists as elements into a `flat' list by replacing each list with its elements (recursively).

(defn flatten-append [input result]
 (loop [input input result result]
  (if (empty? input)
   result
   (recur (pop input) (if (list? (peek input)) (flatten-append (peek input) result) (conj result (peek input)))))))

(defn my-flatten [input]
    (let [start-result []]
    (flatten-append input start-result)))

(defn -main [& args]
 (println (my-flatten '(1 (2 (3 4) 5) 6))))

(-main [])
