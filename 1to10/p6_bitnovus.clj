;;;; Find out whether a list is a palindrome.

(defn palindrome? [input]
    (= input (reverse input)))

(defn -main [& args]
    (println (palindrome? '(1 2 3 4)))
    (println (palindrome? '(4 2 2 4))))

(-main [])
