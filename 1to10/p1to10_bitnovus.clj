;; p1 - Write a function that returns the last element of a list.
(defn my-last [input] 
    (loop [cur-list input]
        (if (empty? (pop cur-list))
            (peek cur-list)
            (recur (pop cur-list)))))

;; p2 - Find the last but one (last and penultimate) elements of a list.
(defn last_two [input]
    (loop [cur-list input]
        (if (empty? (pop (pop cur-list)))
            cur-list
            (recur (pop cur-list)))))

;; p3 - Find the K'th element of a list.
(defn element-at [input k]
    (nth input (- k 1)))

;; p4 - Find the number of elements of a list.
(defn my-count [input]
    (count input))

;; p5 - Reverse a list.
(defn my-reverse [input]
    (reverse input))

;; p6 - Find out whether a list is a palindrome.
(defn palindrome? [input]
    (= input (reverse input)))

;; p7 - Flatten a nested list structure.
;; Transform a list, possibly holding lists as elements into a `flat' list by replacing each list with its elements (recursively).
(defn flatten-append [input result]
 (loop [input input result result]
  (if (empty? input)
   result
   (recur (pop input) (if (list? (peek input)) (flatten-append (peek input) result) (conj result (peek input)))))))

(defn my-flatten [input]
    (let [start-result []]
    (flatten-append input start-result)))

(defn -main [& args]
    (do 
    (println (my-last '(1 2 3 4))))
    (println (last_two '(1 2 3 4))))

(-main [])
