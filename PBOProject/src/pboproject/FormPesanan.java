/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboproject;

import java.text.NumberFormat;

/**
 *
 * @author IQBAL
 */
public class FormPesanan extends javax.swing.JFrame {

    /**
     * Creates new form FormPesanan
     */
    public FormPesanan() {
        initComponents();
         user userLogin = LoginUser.loginc;

        if (userLogin != null) {
            namaus.setText(userLogin.getNama());
            emailus.setText(userLogin.getEmail());
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtJumlahTiket = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtBayar = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtKodeBank = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtNamaPemesan = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        txtNoTelp = new javax.swing.JTextField();
        jComboBoxMaskapai = new javax.swing.JComboBox<>();
        jComboBoxKodeMaskapai = new javax.swing.JComboBox<>();
        txtPenerbanganDari = new javax.swing.JTextField();
        txtPenerbanganKe = new javax.swing.JTextField();
        jCheckBoxDewasa = new javax.swing.JCheckBox();
        jCheckBoxAnakAnak = new javax.swing.JCheckBox();
        jRadioButtonBisnis = new javax.swing.JRadioButton();
        jRadioButtonEkonomi = new javax.swing.JRadioButton();
        namaus = new javax.swing.JLabel();
        emailus = new javax.swing.JLabel();
        txtTanggalPenerbangan = new javax.swing.JTextField();
        PilihBank = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        totharga = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nama User           :");

        jLabel2.setText("Email                    :");

        jLabel3.setText("Nama Pemesan    :");

        jLabel4.setText("Alamat                 :");

        jLabel5.setText("No.Telp                :");

        jLabel6.setText("Nama Maskapai    :");

        jLabel7.setText("Kode Maskapai     :");

        jLabel8.setText("Waktu Dan Tanggal penerbangan     :");

        jLabel9.setText("Penerbangan Dari           :");

        jLabel10.setText("Penerbangan Ke             :");

        jLabel11.setText("Penumpang          :");

        jLabel12.setText("Jenis Tiket            :");

        jLabel13.setText("Harga Tiket          :");

        jLabel14.setText("Jumlah             :");

        jLabel15.setText("Total Harga          :");

        txtJumlahTiket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJumlahTiketActionPerformed(evt);
            }
        });

        jLabel16.setText("Pilih Bank              :");

        jLabel17.setText("Bayar                   :");

        txtBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBayarActionPerformed(evt);
            }
        });

        jLabel18.setText("Kode Bank    :");

        txtKodeBank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKodeBankActionPerformed(evt);
            }
        });

        jButton1.setText("Insert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Clear");

        jComboBoxMaskapai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Garuda Indonesia", "Air Asia", "Abdurahman Saleh" }));

        jComboBoxKodeMaskapai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GRD", "AA", "ABDSH", " " }));

        txtPenerbanganDari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPenerbanganDariActionPerformed(evt);
            }
        });

        txtPenerbanganKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPenerbanganKeActionPerformed(evt);
            }
        });

        jCheckBoxDewasa.setText("Dewasa");
        jCheckBoxDewasa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBoxDewasaMouseClicked(evt);
            }
        });
        jCheckBoxDewasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxDewasaActionPerformed(evt);
            }
        });

        jCheckBoxAnakAnak.setText("Anak- Anak");

        jRadioButtonBisnis.setText("Bisnis");
        jRadioButtonBisnis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButtonBisnisMouseClicked(evt);
            }
        });
        jRadioButtonBisnis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonBisnisActionPerformed(evt);
            }
        });

        jRadioButtonEkonomi.setText("Ekonomi");
        jRadioButtonEkonomi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButtonEkonomiMouseClicked(evt);
            }
        });
        jRadioButtonEkonomi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonEkonomiActionPerformed(evt);
            }
        });

        txtTanggalPenerbangan.setText("yyyy/mm/dd");
        txtTanggalPenerbangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTanggalPenerbanganActionPerformed(evt);
            }
        });

        PilihBank.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BNI", "BRI", "MANDIRI" }));
        PilihBank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PilihBankActionPerformed(evt);
            }
        });

        jLabel19.setText("0.0");

        totharga.setText("0.0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(namaus, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(emailus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNamaPemesan))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAlamat))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNoTelp))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBoxDewasa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBoxAnakAnak))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonBisnis)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonEkonomi))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel19))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PilihBank, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addGap(94, 94, 94))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxKodeMaskapai, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(122, 122, 122))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxMaskapai, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPenerbanganDari)
                                    .addComponent(txtPenerbanganKe))
                                .addGap(84, 84, 84))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTanggalPenerbangan)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(txtJumlahTiket, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(totharga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBayar, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtKodeBank, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(55, 55, 55))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(namaus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(emailus))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNamaPemesan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNoTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxMaskapai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBoxKodeMaskapai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtTanggalPenerbangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtPenerbanganDari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtPenerbanganKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jCheckBoxDewasa)
                    .addComponent(jCheckBoxAnakAnak))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jRadioButtonBisnis)
                    .addComponent(jRadioButtonEkonomi))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtJumlahTiket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(totharga, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(PilihBank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(txtKodeBank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtJumlahTiketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJumlahTiketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJumlahTiketActionPerformed

    private void txtKodeBankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKodeBankActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKodeBankActionPerformed

    private void txtBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBayarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        //Pelanggan
//        String namaPelanggan = txtNamaPemesan.getText();
//        String alamatPelanggan = txtAlamat.getText();
//        String noHpPelangan = txtNoTelp.getText();
//        
//        pelanggan pelanggan = new pelanggan(namaPelanggan, alamatPelanggan, noHpPelangan);
//        pelanggan.save();
//        
//        //Maskapai
//        String namaMaskapai = jComboBoxMaskapai.getSelectedItem().toString();
//        String kodeMaskapai = jComboBoxKodeMaskapai.getSelectedItem().toString();
//        String tanggal = txtTanggalPenerbangan.getText();
//        String penerbanganDari = txtPenerbanganDari.getText();
//        String penerbanganKe = txtPenerbanganKe.getText();
//        
//        Maskapai maskapai = new Maskapai(namaMaskapai, kodeMaskapai, tanggal, penerbanganDari, penerbanganKe);
//        maskapai.save();
//        
//        //Tiket
        String penumpang;
        
        if (jCheckBoxDewasa.isSelected()) {
            penumpang = jCheckBoxDewasa.getText();
            jLabel19.setText("100000");
        }else {
            penumpang = jCheckBoxAnakAnak.getText();
            jLabel19.setText("100000");
        }
        
        String jenisTiket;
        
        if (jRadioButtonBisnis.isSelected()) {
            jenisTiket = jRadioButtonBisnis.getText();
            jLabel19.setText("100000");
        }else {
            jenisTiket = jRadioButtonEkonomi.getText();
            jLabel19.setText("100000");
        }
        
        int hargaTiket = Integer.parseInt(jLabel19.getText());
        int jumlahTiket = Integer.parseInt(txtJumlahTiket.getText());
        int totalHarga = hargaTiket * jumlahTiket;
        
        totharga.setText(String.valueOf(totalHarga));
        
        String bank = PilihBank.getSelectedItem().toString();
        
        if (bank.equalsIgnoreCase("BNI")) {
            txtKodeBank.setText("001");
        }else if (bank.equalsIgnoreCase("BRI")) {
            txtKodeBank.setText("002");
        }else if (bank.equalsIgnoreCase("MANDIRI")) {
            txtKodeBank.setText("003");
        }
        
        String kodeBank = txtKodeBank.getText();
        int bayar = Integer.parseInt(txtBayar.getText());
        
        Tiket tiket = new Tiket(jenisTiket, penumpang, hargaTiket, totalHarga, jumlahTiket, bank, kodeBank, bayar);
        tiket.save();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButtonEkonomiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonEkonomiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonEkonomiActionPerformed

    private void txtPenerbanganDariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPenerbanganDariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPenerbanganDariActionPerformed

    private void txtPenerbanganKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPenerbanganKeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPenerbanganKeActionPerformed

    private void txtTanggalPenerbanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTanggalPenerbanganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTanggalPenerbanganActionPerformed

    private void PilihBankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PilihBankActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PilihBankActionPerformed

    private void jCheckBoxDewasaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxDewasaMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jCheckBoxDewasaMouseClicked

    private void jRadioButtonBisnisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonBisnisMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jRadioButtonBisnisMouseClicked

    private void jRadioButtonEkonomiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonEkonomiMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonEkonomiMouseClicked

    private void jRadioButtonBisnisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonBisnisActionPerformed
        // TODO add your handling code here:
//        if (jRadioButtonBisnis.isSelected()) {
//             jLabel19.setText(NumberFormat.getNumberInstance().format(jLabel19));
//        }
    }//GEN-LAST:event_jRadioButtonBisnisActionPerformed

    private void jCheckBoxDewasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxDewasaActionPerformed
        // TODO add your handling code here:
        if (jCheckBoxDewasa.isSelected()) {
            String penumpang;
        
        if (jCheckBoxDewasa.isSelected()) {
            penumpang = jCheckBoxDewasa.getText();
            jLabel19.setText("100000");
        }else {
            penumpang = jCheckBoxAnakAnak.getText();
            jLabel19.setText("100000");
        }
        
        String jenisTiket;
        
        if (jRadioButtonBisnis.isSelected()) {
            jenisTiket = jRadioButtonBisnis.getText();
            jLabel19.setText("100000");
        }else {
            jenisTiket = jRadioButtonEkonomi.getText();
            jLabel19.setText("100000");
        }
        
        int hargaTiket = Integer.parseInt(jLabel19.getText());
        int jumlahTiket = Integer.parseInt(txtJumlahTiket.getText());
        int totalHarga = hargaTiket * jumlahTiket;
        
        totharga.setText(String.valueOf(totalHarga));
        
        String bank = PilihBank.getSelectedItem().toString();
        
        if (bank.equalsIgnoreCase("BNI")) {
            txtKodeBank.setText("001");
        }else if (bank.equalsIgnoreCase("BRI")) {
            txtKodeBank.setText("002");
        }else if (bank.equalsIgnoreCase("MANDIRI")) {
            txtKodeBank.setText("003");
        }
        
        String kodeBank = txtKodeBank.getText();
        int bayar = Integer.parseInt(txtBayar.getText());
        
        Tiket tiket = new Tiket(jenisTiket, penumpang, hargaTiket, totalHarga, jumlahTiket, bank, kodeBank, bayar);
        tiket.save();
        }
    }//GEN-LAST:event_jCheckBoxDewasaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormPesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */;
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPesanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> PilihBank;
    private javax.swing.JLabel emailus;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBoxAnakAnak;
    private javax.swing.JCheckBox jCheckBoxDewasa;
    private javax.swing.JComboBox<String> jComboBoxKodeMaskapai;
    private javax.swing.JComboBox<String> jComboBoxMaskapai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButtonBisnis;
    private javax.swing.JRadioButton jRadioButtonEkonomi;
    private javax.swing.JLabel namaus;
    private javax.swing.JLabel totharga;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtBayar;
    private javax.swing.JTextField txtJumlahTiket;
    private javax.swing.JTextField txtKodeBank;
    private javax.swing.JTextField txtNamaPemesan;
    private javax.swing.JTextField txtNoTelp;
    private javax.swing.JTextField txtPenerbanganDari;
    private javax.swing.JTextField txtPenerbanganKe;
    private javax.swing.JTextField txtTanggalPenerbangan;
    // End of variables declaration//GEN-END:variables
}
