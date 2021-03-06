/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Pedido;
import Model.PedidoItem;
import Model.Produto;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import javax.swing.JList;
import javax.swing.ListModel;

/**
 *
 * @author Avenger
 */
public class CadastroDePedidos extends javax.swing.JFrame {

    
    /**
     * Creates new form CadastroDePedidos
     */
    
    private Pedido ped;
    private Vector<PedidoItem> itens;
    
    public CadastroDePedidos(String codcli) {
        this.setUndecorated(true);
        initComponents();
        this.populaComboBoxProdutos();
        this.populaComboBoxAdicionais();
        this.iniciaPedido(codcli);
    }
     
    private void iniciaPedido(String codcli) {
        int nroPed = Math.abs((int) new Date().getTime());
        this.ped = new Pedido(nroPed , 0, codcli); // pedido inicia com valor zero
        this.itens = new Vector();
        this.lbNroPed.setText(Integer.toString(nroPed));
        this.lbCli.setText(codcli);
        this.lbStatus.setText("Nenhum Item adicionado");
        this.lbValorTotal.setText("R$ 0,00");
        this.cbAdicional.setVisible(false);
    }

    private void populaComboBoxProdutos(){
        ArrayList<Produto> prods = Produto.getProdutos();
        for(Produto p : prods){
            cbItens.addItem(p);
        }
    }
    
    private void populaComboBoxAdicionais(){
        ArrayList<Produto> adds = Produto.getAdicionais();
        cbAdicional.addItem(new Produto(-1, "-", 0,0));
        for(Produto p : adds){
            cbAdicional.addItem(p);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        cbItens = new javax.swing.JComboBox<>();
        tfQtdItem = new javax.swing.JTextField();
        btAddItem = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lbNroPed = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbCli = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbStatus = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbValorTotal = new javax.swing.JLabel();
        cbAdicional = new javax.swing.JComboBox<>();
        btConsultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Cadastro de Pedidos");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cbItens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbItensActionPerformed(evt);
            }
        });

        btAddItem.setText("Add Item");
        btAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddItemActionPerformed(evt);
            }
        });

        jLabel2.setText("Nro Pedido");

        lbNroPed.setText("jLabel3");

        jLabel3.setText("Cliente:");

        lbCli.setText("jLabel4");

        jLabel4.setText("Status:");

        lbStatus.setText("jLabel5");

        jLabel5.setText("Valor Total:");

        lbValorTotal.setText("jLabel6");

        btConsultar.setText("Consultar");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpar)
                        .addGap(39, 39, 39)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbStatus))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbValorTotal))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbCli))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbNroPed))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbItens, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btAddItem, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfQtdItem)
                                .addComponent(btConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(cbAdicional, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbNroPed))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbCli))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbItens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfQtdItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAddItem)
                    .addComponent(btConsultar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbAdicional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lbStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lbValorTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalvar)
                            .addComponent(btnExcluir)
                            .addComponent(btnLimpar))
                        .addGap(36, 36, 36))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddItemActionPerformed
        // TODO add your handling code here:
        
        int codProdAdd = ((Produto) this.cbItens.getSelectedItem()).getCodprod(); // cod produto a ser adicionado no pedido
        float vlrProdAdd = ((Produto) this.cbItens.getSelectedItem()).getVlrprod(); // valor do prod a ser adicionado no pedido
        int qtdProdAdd = Integer.parseInt(this.tfQtdItem.getText()); // qtdade do prod
        float novoValorPed = this.ped.getVlrnota() +  vlrProdAdd*qtdProdAdd;
        // adiciona um novo item de pedido na lista (arraylist)
        itens.add(new PedidoItem(this.ped.getNuped(),  codProdAdd, qtdProdAdd ));
        
        if(this.cbAdicional.isVisible() && ((Produto) this.cbAdicional.getSelectedItem()).getCodprod() != -1){
            itens.add(new PedidoItem(this.ped.getNuped(),  ((Produto) this.cbAdicional.getSelectedItem()).getCodprod(), 1 ));
        }
        
        // atualiza o valor da nota
        this.ped.setVlrnota(novoValorPed);
        
        this.lbStatus.setText("Item " + ((Produto) this.cbItens.getSelectedItem()).toString() + " foi adicionado ao pedido");
                
        this.lbValorTotal.setText("R$ " + novoValorPed + "\n teste");
        this.tfQtdItem.setText("");
        this.cbItens.setSelectedIndex(0);
    }//GEN-LAST:event_btAddItemActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        this.SalvaPedidoBanco();
        this.SalvaItensPedidoBanco();
        this.EncerraPedido();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void cbItensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbItensActionPerformed
        // TODO add your handling code here:
        if(((Produto) this.cbItens.getSelectedItem()).getCodprod() == 3 || ((Produto) this.cbItens.getSelectedItem()).getCodprod() ==4 || ((Produto) this.cbItens.getSelectedItem()).getCodprod() == 5){
            this.cbAdicional.setVisible(true);
        } else {
            this.cbAdicional.setVisible(false);
        }
    }//GEN-LAST:event_cbItensActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        // TODO add your handling code here:
        new ExibePedido().setVisible(true);
    }//GEN-LAST:event_btConsultarActionPerformed

    
    private void SalvaPedidoBanco() {
        this.ped.gravaPedido();
    }

    private void SalvaItensPedidoBanco() {
        for(PedidoItem ped : this.itens){
            ped.cadastraItemPed();
        }
    }

    private void EncerraPedido() {
        this.dispose();
    }

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddItem;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<Produto> cbAdicional;
    private javax.swing.JComboBox<Produto> cbItens;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbCli;
    private javax.swing.JLabel lbNroPed;
    private javax.swing.JLabel lbStatus;
    private javax.swing.JLabel lbValorTotal;
    private javax.swing.JTextField tfQtdItem;
    // End of variables declaration//GEN-END:variables

}
