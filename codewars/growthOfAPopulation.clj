(ns arge.core)

(defn nb-year [p0 percent aug p]
  (if (>= p0 p)
    0
    (+ 1 (nb-year (+ p0 aug (* p0 (/ percent 100))) percent aug p))))
