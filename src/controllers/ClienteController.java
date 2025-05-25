
package controllers;



import dao.ClienteDao;
import models.Cliente;


class ClienteController {
    
    private ClienteDao ClienteDao;

    public ClienteController(ClienteDao clienteDao) {
        this.ClienteDao = new ClienteDao();
    }
    
    
    public void agregarCliente (String nombre, String email, String telefono, String direccion){
        
        Cliente cliente = new Cliente(nombre, email, telefono, direccion);
        ClienteDao.agregarCliente(cliente);
        System.out.println("Cliente agreagdo correctamente " + cliente);
    }
    
    public List<Cliente> obtenerCliente(){
        return ClienteDao.obtenerCliente();
    }
    
    
    
    
}
