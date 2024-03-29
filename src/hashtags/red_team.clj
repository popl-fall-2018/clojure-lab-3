(ns hashtags.red-team
  (:require [clojure.string :as string]))

; See the first 100 chars in this file.
;(apply str (take 100 (slurp "apple-tweets.txt")))

(defn read-file-to-tokens
  "Reads in the file and breaks it into a list of tokens.
  - parameters: filename
  - returns: list of tokens from the file -- anything separated by whitespace
  - look into: slurp, string/split"
  [filename]
  :replace-me)

; Look at the first 10 tokens
;(take 10 (read-file-to-tokens "apple-tweets.txt"))

(defn get-hashtags
  "Takes a list of string tokens and returns just the hashtags
  - parameters: list of string tokens
  - returns: list containing any string token that starts with #"
  [string-tokens]
  :replace-me)

; Test it:
; (get-hashtags '("notHashtag" "#hashtag" "#college" "computer"))

(defn hashtag-frequencies
  "Returns a list of the hashtag frequencies.
  - parameters: filename
  - returns: map of hashtag frequencies, where keys are hashtags and
    values are how often they appear
  - can assume read-file-to-tokens and get-hashtags functions work
  - look into: frequencies"
  [filename]
  :replace-me)

; See the first 10 hashtag/frequencies
;(take 10 (hashtag-frequencies "apple-tweets.txt"))

(defn sorted-hashtag-frequencies
  "Sorts frequencies by frequency, and returns number of them.
  - parameters: filename, integer n (number of hashtags to return)
  - returns: list of the n most-frequent hashtags, stored as vectors of
    the form [hashtag frequency]
  - can assume hashtag-frequencies works
  - look into: sort-by (it works on maps!)"
  [filename n]
  :replace-me)
  

;; At the end, this will return the 50 most common hashtags
;(sorted-hashtag-frequencies "apple-tweets.txt" 50)
