#!/bin/bash

echo "CONDICIONAL IF"

echo -e "----\t****\t----"

read -p "Ingresa tu edad: " edad

if [ "$edad" -ge 18 ]; then
    echo "Listo para votar"
elif [[ "$edad" -lt 17 && "$edad" -ge 15 ]]; then
    echo "Falta poco para votar"
else 
    echo "Eres un niño"

echo -e "----\t****\t----"


