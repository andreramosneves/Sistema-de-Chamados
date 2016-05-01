/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;

import Persistencia.ChamadoDAO;
import controle.ControleChamados;
import entidade.Chamado;
import entidade.Status;
import junit.framework.TestCase;
import org.junit.Test;

/**
 *
 * @author home
 */
public class TesteAlterarChamado {
    
    
    @Test
    public void testAlterarChamado(){
        ControleChamados chamados = new ControleChamados();
        
        Chamado chamado = chamados.buscaPeloCodigo(1);
        TestCase.assertNotNull(chamados.alterarChamado(chamado,
                Status.aguardando_resposta_do_usuario.name(), "dengue", "deixar agua em pneus."));
    }
    @Test
    public void testBuscaChamado(){
        ControleChamados chamados = new ControleChamados();
        
        Chamado chamado = chamados.buscaPeloCodigo(-1);
        TestCase.assertNull(chamado);
    }
    
}

