package com.sheqet.decorator;

/**
 * Esta es la funcionalidad básica a la que se le añadirán decorators si es necesario.
 * Nótese decorators como clases que añaden funcionalidades, por ejemplo:
  Un usuario en una página siempre tendrá ciertas funciones como ver y escribir,
 pero si este usuario es admin, se le añadirán funciones como borrar y editar,
 y si el usuario es premium, se le añadirán funciones como ver contenido exclusivo.
 */

public class RegularUser implements User{
    @Override
    public void performAction() {
        System.out.println("Performing action as a regular user");
    }
}
