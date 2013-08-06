;;; Find the last box of a list.

(defn my-last [input] 
    (loop [cur-list input result nil]
        (if (empty? cur-list)
            result
            (recur (pop cur-list) (peek cur-list)))))

(defn -main [& args]
    (println (my-last '(1 2 3 4))))

(-main [])
