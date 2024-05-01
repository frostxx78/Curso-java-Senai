package com.agritech.cadastro;
import com.agritech.cadastro.fornecedor.CadFornecedor;
import com.agritech.cadastro.funcionario.CadFuncionario;
import com.agritech.cadastro.maquinario.CadMaquinario;
import com.agritech.cadastro.produto.CadProduto;
import com.agritech.cadastro.safra.CadSafra;
import com.agritech.cadastro.talhao.CadTalhao;

public class Main {
    public static void main(String args[]) {
        CadFornecedor cadastroFornecedor = new CadFornecedor();
        CadFuncionario cadastroFuncionario = new CadFuncionario();
        CadMaquinario cadastroMaquinario = new CadMaquinario();
        CadProduto cadastroProduto = new CadProduto();
        CadSafra cadastroSafra = new CadSafra();
        CadTalhao cadastroTalhao = new CadTalhao();

        System.out.println("Executou Main");
    }
}