/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.awt.List;
/**
 *
 * @author Caue Felp
 */
public interface Persistencia<T> {
    
    public int create (T obj);
    public T findByCodigo(int id);
    public T findByUsuario(String user);
    public void delete(String user);
    public void update(T obj);
    public java.util.List<T> read();
    
}
