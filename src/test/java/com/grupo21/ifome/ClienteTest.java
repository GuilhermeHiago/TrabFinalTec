package com.grupo21.ifome;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.grupo21.ifome.Entidades.Cliente;
import com.grupo21.ifome.Entidades.Posicao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@AutoConfigureMockMvc
public class ClienteTest {
    private Cliente c1,c2;
    private Posicao p;

    @BeforeEach
    public void initialize(){
        p = mock(Posicao.class);
        c1 = new Cliente();
        c2 = new Cliente(1234, "pessoaTest", "email@test.com", "12345678", p, "senha");
        when(p.getX()).thenReturn(35);
        when(p.getY()).thenReturn(35);
    }

    @Test
    public void testGetId(){
        assertEquals(1234, c2.getId());
    }

    @Test
    public void testGetNome(){
        assertEquals("pessoaTest", c2.getNome());
    }

    @Test
    public void testGetEmail(){
        assertEquals("email@test.com", c2.getEmail());
    }

    @Test
    public void testGetCPF(){
        assertEquals("12345678", c2.getCpf());
    }

    @Test
    public void testGetPosicao(){
        assertEquals(p, c2.getPosicao());
    }

    @Test
    public void testGetSenha(){
        assertEquals("senha", c2.getSenha());
    }

    @Test
    public void testSetId(){
        c1.setId(123);
        assertEquals(123, c1.getId());
    }

    @Test
    public void testSetNome(){
        c1.setNome("nome");
        assertEquals("nome", c1.getNome());
    }

    @Test
    public void testSetEmail(){
        c1.setEmail("email@test.com");
        assertEquals("email@test.com", c1.getEmail());
    }

    @Test
    public void testSetCPF(){
        c1.setCpf("12345678");
        assertEquals("12345678", c1.getCpf());
    }

    @Test
    public void testSetPosicao(){
        c1.setPosicao(p);
        assertEquals(p, c1.getPosicao());
    }

    @Test
    public void testSetSenha(){
        c1.setSenha("senha");;
        assertEquals("senha", c1.getSenha());
    }
}