;;;; Find the number of elements of a list.

(defn my-count [input]
    (count input))

(defn -main [& args]
    (println (my-count '(1 2 3 4))))

(-main [])
