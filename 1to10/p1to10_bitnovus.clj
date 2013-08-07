;; p1 - Write a function that returns the last element of a list.
(defn my-last [input] 
 (reduce (fn [cur-val ret-val] ret-val) input))

;; p2 - Find the last but one (last and penultimate) elements of a list.
(defn last-two [input]
 (reduce (fn [cur-val ret-val] (println 'cur cur-val)(println 'ret ret-val) [(if (vector? cur-val) (last cur-val) cur-val) ret-val]) input))

;; p3 - Find the K'th element of a list.
(defn element-at [input k]
 (loop [cur-list input index k]
  (if (= index 1)
   (peek cur-list)
   (recur (pop cur-list) (dec index)))))

;; p4 - Find the number of elements of a list.
(defn my-count [input]
 (reduce (fn [cur-val ret-val] (inc cur-val)) 0 input))

;; p5 - Reverse a list.
(defn my-reverse [input]
 (reduce (fn [cur-val ret-val] (conj cur-val ret-val)) () input))

;; p6 - Find out whether a list is a palindrome.
(defn palindrome? [input]
 (= input (my-reverse input)))

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

;; p8 - Eliminate consecutive duplicates of list elements.
(defn my-compress [input]
 (reduce (fn [cur-val ret-val] (if (not= (peek cur-val) ret-val) (conj cur-val ret-val) cur-val)) [] input))

(defn -main [& args]
 (do 
  (println (my-compress '(1 1 1 1 2 2 2 3 4 5 5 5 4 3 2 2 1)))))

(-main [])
