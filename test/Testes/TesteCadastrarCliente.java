/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;

import Persistencia.ClienteDAO;
import Persistencia.EmpresaDAO;
import entidade.ClienteEmpresa;
import entidade.Empresa;
import java.util.Collection;
import java.util.Iterator;
import junit.framework.TestCase;
import org.junit.Test;

/**
 *
 * @author home
 */
public class TesteCadastrarCliente {
    
    @Test
    public void CadastrarCliente(){
       EmpresaDAO  mapeadorEmpresa = new EmpresaDAO();
        //fiz isso soh pra nao quebrar os metodos dessa classe por enquanto, sei q
        //nao deveria ficar aqui
     Collection<Empresa> empresas = mapeadorEmpresa.getEmpresas();
     Iterator<Empresa> Iempresas = empresas.iterator();
      ClienteEmpresa cli = null;
     while(Iempresas.hasNext()){
         cli = new ClienteEmpresa(2, Iempresas.next(),111111111, "patricia", 123456789);
         break;
     }
     ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.put(cli);
     
    }
    @Test
    public void ConfirmarClienteCadastrado(){
         EmpresaDAO  mapeadorEmpresa = new EmpresaDAO();
        //fiz isso soh pra nao quebrar os metodos dessa classe por enquanto, sei q
        //nao deveria ficar aqui
     Collection<Empresa> empresas = mapeadorEmpresa.getEmpresas();
     Iterator<Empresa> Iempresas = empresas.iterator();
     
        ClienteEmpresa cli = new ClienteEmpresa(0, Iempresas.next(), 00000000000, "PEDRO ROBERTO", 47893883);  
        ClienteDAO cliDAO = new ClienteDAO();
        long cod = cli.getCodigo();
        ClienteEmpresa cliTest = cliDAO.get(cod);
        TestCase.assertEquals(cliTest.toString(), cli.toString());
        
        
        
    }
}
