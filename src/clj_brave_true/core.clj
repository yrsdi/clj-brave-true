(comment
  ;; clojure mengenal 2 jenis structure 
  ;; 1. Literal representations of data structures (like numbers, strings, maps, and vectors)
  ;; 1, "a string", ["a" "vector" "of" "string"]
  ;; 2. Operations
  ;; (operator operand1 operand2.. operandN) 
  ;; example
  (+ 1 2 3)
  ;; operasi bersarang
  (+ (* 10 5) 50)
  (str "learn " "clojure " "programming " "language")
  ;; struktur clojure sangat simple & konsisten jika di compare dgn bahasa lain
  ;; control flow (if do when)
  ;; IF
  ;; bolean-form
  (if true
   ;; then-form 
    "string akan di tampilkan ketika expresi di evaluate"
    ;; optional-else-form
    "string ini tidak akan di evaluate")
  ;; Do, do operator membungkus multiple from ekspresi dan menjalankan masing2 darinya
  (if true
    (do (println "Success")
        "String ini akan ditampilkan setelahnya")
    (do (println "Failure")
        "String ini tidak akan ditampilan karena hanya mengevaluate jika kondisinya true"))
  ;; WHEN, adalah kombinasi (IF + DO) tanpa cabang else
  (when true
    (println "success")
    "String ini akan di evaluate")

  ;; nil, true, false, Truthiness, Equality, and Boolean Expressions
  ;; nil digunakan untuk identifikasi 'no value'
  (nil? 1) (nil? nil)
  ;; Truthiness
  (if "saya makan udang"
    "badan gatal dan mual")
  (if nil 
    "pesan ini tidak akan di evaluate, karena kondisi yg dimita false (kosong)")
  )
  ;; equality operator 
  (= 1 1)
  (= nil nil)
  (= 1 2)
  (= 'string' "string")
  (= "String" "string")
  ;; boolean operator (or and)
  ;; or akan mengembalikan nilai "true" dari yg pertama atau terakhir
  ;; and akan mengembalikan nilai "false" dari yg pertama atau jika "no values" akan mengembalikan nilai "false" atau nilai "true" yg terakhir
  (or false nil :large_I_mean_venti :why_cant_I_just_say_large)
  (or (= 1 0) (= "yes" "yes"))
  (and (= 1 0) (= "yes" "yes"))



(ns clj-brave-true.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

