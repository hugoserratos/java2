/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;

public class Imc {
float peso;
float altura;

public Imc (float p, float a)
{
peso = p;
altura = a;
}
public float calcular ()
{
float imc =peso/(altura*altura);
return imc;
}
}

