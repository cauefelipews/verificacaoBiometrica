/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author Caue Felp
 */
public class Produtora {
    
    private int codigo;
    private String NumEmpregados,QtMaquinas,Nivel, nome,endereco,produtos,destino,producao;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNumEmpregados() {
        return NumEmpregados;
    }

    public void setNumEmpregados(String NumEmpregados) {
        this.NumEmpregados = NumEmpregados;
    }

    public String getQtMaquinas() {
        return QtMaquinas;
    }

    public void setQtMaquinas(String QtMaquinas) {
        this.QtMaquinas = QtMaquinas;
    }

    public String getNivel() {
        return Nivel;
    }

    public void setNivel(String Nivel) {
        this.Nivel = Nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getProdutos() {
        return produtos;
    }

    public void setProdutos(String produtos) {
        this.produtos = produtos;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getProducao() {
        return producao;
    }

    public void setProducao(String producao) {
        this.producao = producao;
    }
    
    public Produtora(){};

    public Produtora(int codigo, String NumEmpregados, String QtMaquinas, String Nivel, String nome, String endereco, String produtos, String destino, String producao) {
        setCodigo(codigo);
        setNumEmpregados(NumEmpregados);
        setQtMaquinas(QtMaquinas); 
        setNivel(Nivel);
        setNome(nome);
        setEndereco(endereco);
        setProdutos(produtos);
        setDestino(destino);
        setProducao(producao);
    }

    @Override
    public String toString() {
        return  "C??digo do Fabricante..........................:" + String.valueOf(getCodigo())+ "\n" +
                "Nome da unidade produtora.....................:" + getNome() + "\n" +
                "Endere??o do produtor agr??cola.................:" + getEndereco() + "\n" +
                "N??mero de empregados da unidade produtora.....:" + getNumEmpregados() + "\n" +
                "Quantidade de m??quinas e implementos aqu??colas:" + getQtMaquinas()+ "\n" +
                "N??vel de automa????o da unidade produtora.......:" + getNivel() + "\n" +
                "Produto(s) agr??colas produzidos...............:" + getProdutos() + "\n" +
                "Destino da produ????o...........................:" + getDestino() + "\n" +
                "Produ????o anual em quilogramas.................:" + getProducao();
    }

    
    

}
