/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;

import Persistencia.EmpresaDAO;
import controle.ControleEmpresas;
import controle.IControlador;
import entidade.Empresa;
import java.util.Iterator;
import java.util.Random;
import junit.framework.TestCase;
import org.junit.Test;

/**
 *
 * @author home
 */
public class TesteCadastrarEmpresa {

    @Test
    public void testInsercaoMesmaEmpresa() {
        Random rand = new Random();
        EmpresaDAO mapeadorEmpresa = new EmpresaDAO();
        Iterator<Empresa> iEmpresas = mapeadorEmpresa.getEmpresas().iterator();
        IControlador controle = new ControleEmpresas();
        while (iEmpresas.hasNext()) {
            Empresa empresa = iEmpresas.next();
            TestCase.assertEquals(controle.inserir(empresa.getNumeroContrato(), empresa.getNomeEmpresa()), null);
            break;
        }
    }

    @Test
    public void testEmpresaContratoNegativo() {
        Random rand = new Random();
        Long contrato = ((long) rand.nextInt(1000))*-1;
        EmpresaDAO mapeadorEmpresa = new EmpresaDAO();
        Iterator<Empresa> iEmpresas = mapeadorEmpresa.getEmpresas().iterator();
        IControlador controle = new ControleEmpresas();
        while (iEmpresas.hasNext()) {
            Empresa empresa = iEmpresas.next();
            TestCase.assertEquals(controle.inserir(contrato, "Tem Retornar Nulo"), null);
            break;
        }
    }
    
    
    @Test
    public void testNovaEmpresa() {
        Random rand = new Random();
        EmpresaDAO mapeadorEmpresa = new EmpresaDAO();
        Iterator<Empresa> iEmpresas = mapeadorEmpresa.getEmpresas().iterator();
        IControlador controle = new ControleEmpresas();
        Long nroContrato;
        String nome;
            nroContrato = (long) rand.nextInt();
            nome = String.valueOf(rand.nextInt()) + 
                    String.valueOf(rand.nextInt()) + 
                    String.valueOf(rand.nextInt()) + String.valueOf(rand.nextInt());
        
        while (iEmpresas.hasNext()) {
            Empresa empresa = iEmpresas.next();
            while(nroContrato == empresa.getNumeroContrato() ){
                nroContrato = rand.nextLong();
            }
            while(nome.equals(empresa.getNomeEmpresa())){
            nome = String.valueOf(rand.nextInt()) + 
                    String.valueOf(rand.nextInt()) + 
                    String.valueOf(rand.nextInt()) + 
                    String.valueOf(rand.nextInt()) + 
                    String.valueOf(rand.nextInt()) + 
                    String.valueOf(rand.nextInt()) + String.valueOf(rand.nextInt());
            }
            
        }
        TestCase.assertNotNull(controle.inserir(nroContrato,nome));

    }

}
