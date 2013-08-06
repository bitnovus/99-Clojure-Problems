;;;; Find the K'th element of a list.

(defn element-at [input k]
    (nth input (- k 1)))

(defn -main [& args]
    (println (element-at '(1 2 3 4) 3)))

(-main [])
