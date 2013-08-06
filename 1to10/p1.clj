;;; Find the last box of a list.

(defn my-last [input] 
    (last input))

(defn -main [& args]
    (println (my-last '(1 2 3 4))))

(-main [])
