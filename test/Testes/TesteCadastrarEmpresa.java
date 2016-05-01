/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;

import controle.ControleEmpresas;
import controle.IControlador;
import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;

/**
 *
 * @author home
 */
public class TesteCadastrarEmpresa {
    
    
    @Test
    public void testInsercaoMesmaEmpresa()   {
        IControlador controle = new ControleEmpresas();
        TestCase.assertEquals(controle.inserir(2, ""),null);
    }
    
}
