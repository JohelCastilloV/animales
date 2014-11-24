(deftemplate animal
   (slot nombre)
)
(defrule is-dog 
  (sonido guau)
   =>
   (printout t "Es un perro" crlf)
   (assert (animal (nombre perro)))
)
(defrule is-duck 
  (sonido cua)
   =>
   (printout t "Es un pato" crlf)
   (assert (animal (nombre pato)))
)
(defrule is-cat 
  (sonido miau)
   =>
   (printout t "Es un gato" crlf)
   (assert (animal (nombre gato)))
)
(defrule is-cow 
  (sonido mu)
   =>
   (printout t "Es una vaca " crlf)
   (assert (animal (nombre vaca)))
)
