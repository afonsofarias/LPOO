/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quitanda;



/**
 *
 * @author afons
 */
public class Quitanda3 extends javax.swing.JFrame {
    public Quitanda3() {
        initComponents();
    }
    int qtd = 0;
    int row =0;
    double total= 0;
    Produto produtoatualsel;
    Produto agua = new Produto("100","3.50","Água Mineral 350ML","1");
    Produto coca = new Produto("101","5.50", "Coca Cola Lata 350ML", "1");
    Produto jesus = new Produto("102","5.00","Guaraná Jesus Lata 350ML","1");
    Produto shake = new Produto("103","16.50","Milkshake Frapé 500ML","1");
    Produto artesanal = new Produto("104","15.00", "Hamburguer Artesanal 120G", "1");
    Produto xtudo = new Produto("105","10.00","X Tudo ","1");
    Produto batata = new Produto("106","6.00","Batata Artesanal Feita Em Caza","1");
    Produto misto = new Produto("107","10.00","Misto Quântico","1");
    
    
    void showdata(Produto produto){
        campoCodigo.setText(produto.campoCodigo);
        campoPreco.setText("R$ "+produto.campoPreco);
        campoDescricao.setText(produto.campoDescricao);
        campoQtd.setText(produto.campoQtd);
        produtoatualsel = produto;
    }
    void addproduto(Produto produto,int index,int qtd){
       tabelaVendas.setValueAt( produto.campoCodigo, index, 0);
       tabelaVendas.setValueAt( produto.campoDescricao, index, 1);
       tabelaVendas.setValueAt(  qtd, index, 2);
       tabelaVendas.setValueAt((Double.parseDouble(produto.campoPreco) * qtd), index, 3);
             
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelProdutos = new javax.swing.JPanel();
        Bagua = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Bjesus = new javax.swing.JButton();
        Bmisto = new javax.swing.JButton();
        Bcoca = new javax.swing.JButton();
        Bshake = new javax.swing.JButton();
        Bbatata = new javax.swing.JButton();
        Bxtudo = new javax.swing.JButton();
        Bartesanal = new javax.swing.JButton();
        painelVenda = new javax.swing.JPanel();
        campoPreco = new javax.swing.JTextField();
        campoDescricao = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        campoQtd = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Bmais = new javax.swing.JButton();
        Bmenos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaVendas = new javax.swing.JTable();
        Bincluir = new javax.swing.JButton();
        campoTroco = new javax.swing.JTextField();
        campoTotal = new javax.swing.JTextField();
        Ltroco = new javax.swing.JLabel();
        Ltotal = new javax.swing.JLabel();
        Bfinalizar = new javax.swing.JButton();
        campoCodigo = new javax.swing.JTextField();
        Lpreco = new javax.swing.JLabel();
        Ltitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelProdutos.setBackground(new java.awt.Color(204, 255, 255));

        Bagua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quitanda/agua.jpg"))); // NOI18N
        Bagua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BaguaMouseClicked(evt);
            }
        });
        Bagua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BaguaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Água Mineral");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Coca Cola");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Guaraná Jesus");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Milk Shake");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Misto Quente");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Hamb. Artesanal");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Batata Frita");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("X Tudo");

        Bjesus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quitanda/jesus.jpeg"))); // NOI18N
        Bjesus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BjesusMouseClicked(evt);
            }
        });
        Bjesus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BjesusActionPerformed(evt);
            }
        });

        Bmisto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quitanda/misto.jpg"))); // NOI18N
        Bmisto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BmistoMouseClicked(evt);
            }
        });
        Bmisto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BmistoActionPerformed(evt);
            }
        });

        Bcoca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quitanda/coca.jpg"))); // NOI18N
        Bcoca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BcocaMouseClicked(evt);
            }
        });
        Bcoca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcocaActionPerformed(evt);
            }
        });

        Bshake.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quitanda/MILKSHAKE.jpg"))); // NOI18N
        Bshake.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BshakeMouseClicked(evt);
            }
        });
        Bshake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BshakeActionPerformed(evt);
            }
        });

        Bbatata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quitanda/batata.jpg"))); // NOI18N
        Bbatata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BbatataMouseClicked(evt);
            }
        });
        Bbatata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbatataActionPerformed(evt);
            }
        });

        Bxtudo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quitanda/xtudo.jpg"))); // NOI18N
        Bxtudo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BxtudoMouseClicked(evt);
            }
        });
        Bxtudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BxtudoActionPerformed(evt);
            }
        });

        Bartesanal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quitanda/hamburguer.jpg"))); // NOI18N
        Bartesanal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BartesanalMouseClicked(evt);
            }
        });
        Bartesanal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BartesanalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelProdutosLayout = new javax.swing.GroupLayout(painelProdutos);
        painelProdutos.setLayout(painelProdutosLayout);
        painelProdutosLayout.setHorizontalGroup(
            painelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelProdutosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(painelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelProdutosLayout.createSequentialGroup()
                        .addComponent(Bmisto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Bartesanal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(Bxtudo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(painelProdutosLayout.createSequentialGroup()
                        .addGroup(painelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelProdutosLayout.createSequentialGroup()
                                .addGroup(painelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(painelProdutosLayout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(painelProdutosLayout.createSequentialGroup()
                                        .addComponent(Bagua, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Bcoca, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(painelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Bjesus, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(painelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(painelProdutosLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(Bshake, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 14, Short.MAX_VALUE))
                            .addGroup(painelProdutosLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addGroup(painelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelProdutosLayout.createSequentialGroup()
                    .addContainerGap(534, Short.MAX_VALUE)
                    .addComponent(Bbatata, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(14, 14, 14)))
        );
        painelProdutosLayout.setVerticalGroup(
            painelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelProdutosLayout.createSequentialGroup()
                .addGroup(painelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelProdutosLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(Bagua))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelProdutosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Bjesus, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Bcoca, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Bshake, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(painelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelProdutosLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(Bmisto)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelProdutosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Bxtudo)
                            .addComponent(Bartesanal))
                        .addGap(10, 10, 10)))
                .addGroup(painelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(119, Short.MAX_VALUE))
            .addGroup(painelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelProdutosLayout.createSequentialGroup()
                    .addContainerGap(293, Short.MAX_VALUE)
                    .addComponent(Bbatata)
                    .addGap(157, 157, 157)))
        );

        painelVenda.setBackground(new java.awt.Color(255, 255, 204));

        campoPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPrecoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Código");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Descrição");

        campoQtd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Quantidade");

        Bmais.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Bmais.setText("+");
        Bmais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BmaisActionPerformed(evt);
            }
        });

        Bmenos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Bmenos.setText("-");
        Bmenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BmenosActionPerformed(evt);
            }
        });

        tabelaVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Descrição", "QTD", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaVendas.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(tabelaVendas);
        if (tabelaVendas.getColumnModel().getColumnCount() > 0) {
            tabelaVendas.getColumnModel().getColumn(0).setMinWidth(50);
            tabelaVendas.getColumnModel().getColumn(0).setMaxWidth(50);
            tabelaVendas.getColumnModel().getColumn(2).setMinWidth(35);
            tabelaVendas.getColumnModel().getColumn(2).setMaxWidth(35);
            tabelaVendas.getColumnModel().getColumn(3).setMinWidth(55);
            tabelaVendas.getColumnModel().getColumn(3).setMaxWidth(55);
        }

        Bincluir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Bincluir.setText("Incluir");
        Bincluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BincluirActionPerformed(evt);
            }
        });

        campoTroco.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        campoTroco.setForeground(new java.awt.Color(255, 0, 0));
        campoTroco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTrocoActionPerformed(evt);
            }
        });

        campoTotal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        campoTotal.setForeground(new java.awt.Color(0, 153, 0));
        campoTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTotalActionPerformed(evt);
            }
        });

        Ltroco.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 24)); // NOI18N
        Ltroco.setForeground(new java.awt.Color(255, 0, 0));
        Ltroco.setText("Troco");

        Ltotal.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 24)); // NOI18N
        Ltotal.setForeground(new java.awt.Color(0, 153, 0));
        Ltotal.setText("Total");

        Bfinalizar.setBackground(new java.awt.Color(0, 102, 102));
        Bfinalizar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        Bfinalizar.setText("Finalizar");
        Bfinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BfinalizarActionPerformed(evt);
            }
        });

        Lpreco.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Lpreco.setText("Preço");

        javax.swing.GroupLayout painelVendaLayout = new javax.swing.GroupLayout(painelVenda);
        painelVenda.setLayout(painelVendaLayout);
        painelVendaLayout.setHorizontalGroup(
            painelVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoDescricao)
                    .addGroup(painelVendaLayout.createSequentialGroup()
                        .addGroup(painelVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Ltotal)
                            .addComponent(campoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(painelVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Ltroco)
                            .addComponent(campoTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addComponent(Bfinalizar))
                    .addGroup(painelVendaLayout.createSequentialGroup()
                        .addComponent(Bmenos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bmais)
                        .addGap(18, 18, 18)
                        .addComponent(Bincluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelVendaLayout.createSequentialGroup()
                        .addGroup(painelVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(campoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(painelVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lpreco)
                            .addComponent(campoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        painelVendaLayout.setVerticalGroup(
            painelVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelVendaLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(painelVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(Lpreco))
                .addGap(16, 16, 16)
                .addGroup(painelVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelVendaLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addGroup(painelVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(painelVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(campoQtd)
                                .addComponent(Bmais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Bincluir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Bmenos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(Ltotal)
                        .addGap(18, 18, 18)
                        .addComponent(campoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelVendaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Ltroco)
                        .addGap(18, 18, 18)
                        .addGroup(painelVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bfinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24))
        );

        Ltitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Ltitulo.setForeground(new java.awt.Color(0, 0, 153));
        Ltitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ltitulo.setText("SGL - Sistema de Gerenciamento de Lanchonete                    Lanchonete Porca Flamejante");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ltitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(painelProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(painelVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Ltitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BaguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BaguaActionPerformed
              
//       Inserir os valores no objeto agua
//        agua.campoCodigo = "100";
//        agua.campoPreco = "3.50";
//        agua.campoDescricao = "campoDescricao";
//        agua.campoQtd = "1";
        
//         Colocar esse valores na tela - Deve-se chamar o componente da tela
//         e passar o valor do objeto agua
        showdata(agua);

    }//GEN-LAST:event_BaguaActionPerformed

    private void BincluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BincluirActionPerformed
        addproduto(produtoatualsel,row,Integer.parseInt(campoQtd.getText()));
        row++;
        total += Double.parseDouble(produtoatualsel.campoPreco)* Double.parseDouble(campoQtd.getText());
        campoTotal.setText("R$ "+Double.toString(total));
        
    }//GEN-LAST:event_BincluirActionPerformed

    private void BmaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BmaisActionPerformed
        qtd = Integer.parseInt(campoQtd.getText()) + 1;
        campoQtd.setText(Integer.toString(qtd));
    }//GEN-LAST:event_BmaisActionPerformed

    private void BmenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BmenosActionPerformed
       qtd = Integer.parseInt(campoQtd.getText()) - 1;
        campoQtd.setText(Integer.toString(qtd));
    }//GEN-LAST:event_BmenosActionPerformed

    private void BfinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BfinalizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BfinalizarActionPerformed

    private void campoTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTotalActionPerformed

    private void campoTrocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTrocoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTrocoActionPerformed

    private void campoPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPrecoActionPerformed

    private void BaguaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BaguaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BaguaMouseClicked

    private void BjesusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BjesusMouseClicked
          showdata(jesus);
    }//GEN-LAST:event_BjesusMouseClicked

    private void BjesusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BjesusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BjesusActionPerformed

    private void BmistoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BmistoMouseClicked
          showdata(misto);
    }//GEN-LAST:event_BmistoMouseClicked

    private void BmistoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BmistoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BmistoActionPerformed

    private void BcocaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BcocaMouseClicked
         showdata(coca);
    }//GEN-LAST:event_BcocaMouseClicked

    private void BcocaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcocaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BcocaActionPerformed

    private void BshakeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BshakeMouseClicked
          showdata(shake);
    }//GEN-LAST:event_BshakeMouseClicked

    private void BshakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BshakeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BshakeActionPerformed

    private void BbatataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BbatataMouseClicked
          showdata(batata);
    }//GEN-LAST:event_BbatataMouseClicked

    private void BbatataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BbatataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BbatataActionPerformed

    private void BxtudoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BxtudoMouseClicked
          showdata(xtudo);
    }//GEN-LAST:event_BxtudoMouseClicked

    private void BxtudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BxtudoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BxtudoActionPerformed

    private void BartesanalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BartesanalMouseClicked
         showdata(artesanal);
    }//GEN-LAST:event_BartesanalMouseClicked

    private void BartesanalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BartesanalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BartesanalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        ConexaoDB db = new ConexaoDB();
        db.ConectarDB();
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bagua;
    private javax.swing.JButton Bartesanal;
    private javax.swing.JButton Bbatata;
    private javax.swing.JButton Bcoca;
    private javax.swing.JButton Bfinalizar;
    private javax.swing.JButton Bincluir;
    private javax.swing.JButton Bjesus;
    private javax.swing.JButton Bmais;
    private javax.swing.JButton Bmenos;
    private javax.swing.JButton Bmisto;
    private javax.swing.JButton Bshake;
    private javax.swing.JButton Bxtudo;
    private javax.swing.JLabel Lpreco;
    private javax.swing.JLabel Ltitulo;
    private javax.swing.JLabel Ltotal;
    private javax.swing.JLabel Ltroco;
    private javax.swing.JTextField campoCodigo;
    private javax.swing.JTextField campoDescricao;
    private javax.swing.JTextField campoPreco;
    private javax.swing.JTextField campoQtd;
    private javax.swing.JTextField campoTotal;
    private javax.swing.JTextField campoTroco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel painelProdutos;
    private javax.swing.JPanel painelVenda;
    private javax.swing.JTable tabelaVendas;
    // End of variables declaration//GEN-END:variables
}
