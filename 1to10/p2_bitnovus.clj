;;;; Find the last but one box of a list.

(defn my-but-last [input]
    (def next-to-last (nth input (- (count input) 2)))
    [next-to-last (last input)])

(defn -main [& args]
    (println (my-but-last '(1 2 3 4))))

(-main [])
