package br.com.views;

import br.com.CoisasUteis.GeradorId;
import br.com.Models.*;
import br.com.buscas.*;
import br.com.controllers.*;
import br.com.criar.*;
import br.com.delete.*;
import br.com.editar.*;
import br.com.email.EmailSenha;
import br.com.email.JavaMailApp;
import br.com.email.RecuperaSenha;
import br.com.pdf.Gerar;
import java.awt.CardLayout;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class TelaInicial extends javax.swing.JFrame {

    Aluno aluno;
    Administrador adm;
    Evento even;
    Subevento subev;
    Palestrante palestrante;
    public TelaInicial (){
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPrincipal = new javax.swing.JPanel();
        jMenu = new javax.swing.JPanel();
        jEscolhaLogin = new javax.swing.JPanel();
        jBotLoginAdm = new javax.swing.JButton();
        jTxtInstituição = new javax.swing.JLabel();
        jTxtAluno = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        recuperarSenhaAluno = new javax.swing.JPanel();
        jInserirDadosAdm3 = new javax.swing.JPanel();
        botEntrarAdm4 = new javax.swing.JButton();
        txtInstucional3 = new javax.swing.JLabel();
        espacoTxtRecuperarSenha1 = new javax.swing.JTextField();
        txtEmail3 = new javax.swing.JLabel();
        botEntrarAdm5 = new javax.swing.JButton();
        jLoginAluno = new javax.swing.JPanel();
        jInserirDadosAluno = new javax.swing.JPanel();
        botEntrarAluno = new javax.swing.JButton();
        txtAluno = new javax.swing.JLabel();
        EspacoTxtEmaiAluno = new javax.swing.JTextField();
        txtEmailAluno = new javax.swing.JLabel();
        txtSenhaAluno = new javax.swing.JLabel();
        botMudarLoginAdm = new javax.swing.JButton();
        TxtSenhaLoginAluno = new javax.swing.JPasswordField();
        botEntrarAluno1 = new javax.swing.JButton();
        perfilAluno = new javax.swing.JPanel();
        inter3 = new javax.swing.JPanel();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        editarAlunoSistema = new javax.swing.JPanel();
        selecaoDadosInst5 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        botCancCadAdm5 = new javax.swing.JButton();
        botConfCadIns5 = new javax.swing.JButton();
        espacoTxtNomeAluno = new javax.swing.JTextField();
        espacoTxtEmailAluno = new javax.swing.JTextField();
        novaSenhaAluno = new javax.swing.JPasswordField();
        confNovaSenhaAluno = new javax.swing.JPasswordField();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        ConfSenhaAtualAluno = new javax.swing.JPasswordField();
        jLabel66 = new javax.swing.JLabel();
        espacoTxtCpfAluno = new javax.swing.JLabel();
        eventoAluno = new javax.swing.JPanel();
        inter4 = new javax.swing.JPanel();
        jButton42 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        listaEventosPAluno = new javax.swing.JList<>();
        jButton49 = new javax.swing.JButton();
        VisEventoAluno = new javax.swing.JPanel();
        inter1 = new javax.swing.JPanel();
        jButton36 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        Informação = new javax.swing.JLabel();
        recebeNomeEventoPAluno = new javax.swing.JLabel();
        recebeEnderecoEventoPAluno = new javax.swing.JLabel();
        recebeDataInicioEventoPAluno = new javax.swing.JLabel();
        recebeDataFimEventoPAluno = new javax.swing.JLabel();
        recebeHoraInicioEventoPAluno = new javax.swing.JLabel();
        recebeHoraFimEventoPAluno = new javax.swing.JLabel();
        recebeAreaEventoPAluno = new javax.swing.JLabel();
        recebeVagasEventoPAluno = new javax.swing.JLabel();
        recebeCargaHEventoPAluno = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jButton50 = new javax.swing.JButton();
        subEventoAluno = new javax.swing.JPanel();
        inter7 = new javax.swing.JPanel();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        listaSubEventosPAluno = new javax.swing.JList<>();
        visSubEventoAluno = new javax.swing.JPanel();
        inter12 = new javax.swing.JPanel();
        jButton47 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        recebeNomeSubEventoPAluno = new javax.swing.JLabel();
        recebeEnderecoSubEventoPAluno = new javax.swing.JLabel();
        recebeCargaHSubEventoPAluno = new javax.swing.JLabel();
        recebeDataSubEventoPAluno = new javax.swing.JLabel();
        recebeHoraFimSubEventoPAluno = new javax.swing.JLabel();
        recebeVagasSubEventoPAluno = new javax.swing.JLabel();
        recebeHoraInicioSubEventoPAluno = new javax.swing.JLabel();
        Informação1 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        recebeNomePalestrantePAluno = new javax.swing.JLabel();
        recebeTelefonePalestrantePAluno1 = new javax.swing.JLabel();
        recebeEmailPalestrantePAluno2 = new javax.swing.JLabel();
        cadastroAdm = new javax.swing.JPanel();
        selecaoDadosInst = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        botCancCadAdm = new javax.swing.JButton();
        botConfCadIns = new javax.swing.JButton();
        espacoTxtNomeIns = new javax.swing.JTextField();
        espacoTxtEmailCadInst = new javax.swing.JTextField();
        espTxtConfEmailInst = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        txtCnpj = new javax.swing.JFormattedTextField();
        recuperarSenhaAdm = new javax.swing.JPanel();
        jInserirDadosAdm2 = new javax.swing.JPanel();
        botRecuperarAdm = new javax.swing.JButton();
        txtInstucional2 = new javax.swing.JLabel();
        espacoTxtRecuperarSenha = new javax.swing.JTextField();
        txtEmail2 = new javax.swing.JLabel();
        botCancRecuperarAdm = new javax.swing.JButton();
        jLoginAdm = new javax.swing.JPanel();
        jInserirDadosAdm = new javax.swing.JPanel();
        botEntrarAdm = new javax.swing.JButton();
        txtInstucional = new javax.swing.JLabel();
        espacoTxtEmail = new javax.swing.JTextField();
        botCadastraAdm = new javax.swing.JButton();
        txtEmail = new javax.swing.JLabel();
        txtSenha = new javax.swing.JLabel();
        botMudarLoginAluno = new javax.swing.JButton();
        espacoTxtSenha = new javax.swing.JPasswordField();
        jButton8 = new javax.swing.JButton();
        perfilAdm = new javax.swing.JPanel();
        inter = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        gerenciarContaAdm = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        editarDadosAdm = new javax.swing.JPanel();
        selecaoDadosInst1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        botCancCadAdm1 = new javax.swing.JButton();
        botConfCadIns1 = new javax.swing.JButton();
        espacoTxtEditarNomeIns = new javax.swing.JTextField();
        espacoTxtEditarEmailCadInst = new javax.swing.JTextField();
        espTxtEditarConfEmailInst = new javax.swing.JTextField();
        senhaEditarIns = new javax.swing.JPasswordField();
        confirmarSenhaEditarIns = new javax.swing.JPasswordField();
        recebeCnpjIns = new javax.swing.JLabel();
        gerenciarAlunoAdm = new javax.swing.JPanel();
        jButton17 = new javax.swing.JButton();
        botAddAlunoPAdm = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaAlunosPAdm = new javax.swing.JList<>();
        botExcluirAlunoPAdm = new javax.swing.JButton();
        botExcluirAlunoPAdm1 = new javax.swing.JButton();
        addAlunoSistema = new javax.swing.JPanel();
        selecaoDadosInst2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        botCancCadAdm2 = new javax.swing.JButton();
        botConfCadIns2 = new javax.swing.JButton();
        espacoTxtNomeAlunoPAdm = new javax.swing.JTextField();
        espacoTxtEmailAlunoPAdm = new javax.swing.JTextField();
        espacoTxtCpfAlunoPAdm = new javax.swing.JFormattedTextField();
        visAlunoAdm = new javax.swing.JPanel();
        jButton27 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel73 = new javax.swing.JLabel();
        recebeNomeAluno = new javax.swing.JLabel();
        recebeEmailAluno = new javax.swing.JLabel();
        recebeCpfAluno = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        addEventoSistema = new javax.swing.JPanel();
        inter8 = new javax.swing.JPanel();
        selecaoDadosInst3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        botCancCadAdm3 = new javax.swing.JButton();
        botConfCadIns3 = new javax.swing.JButton();
        espacoTxtNomeEvento = new javax.swing.JTextField();
        espacoTxtEnderecoEventoInst = new javax.swing.JTextField();
        espTxtAreaEnsinoEvento = new javax.swing.JTextField();
        dataEventoinicio = new javax.swing.JFormattedTextField();
        jLabel22 = new javax.swing.JLabel();
        dataEventoFim = new javax.swing.JFormattedTextField();
        HorInicioEvento = new javax.swing.JFormattedTextField();
        HorFiimEvento = new javax.swing.JFormattedTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        espTxtCargaHEvento = new javax.swing.JTextField();
        espTxtVagasEvento = new javax.swing.JTextField();
        gerenciarEventoAdm = new javax.swing.JPanel();
        inter5 = new javax.swing.JPanel();
        jButton18 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaEventosPAdm = new javax.swing.JList<>();
        jButton19 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        visEventoAdm = new javax.swing.JPanel();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        recebeNomeEventoInf = new javax.swing.JLabel();
        recebeEnderecoEventoInf = new javax.swing.JLabel();
        recebeDataInicioEventoInf = new javax.swing.JLabel();
        recebeDataFimEventoInf = new javax.swing.JLabel();
        recebeHoraInicioEventoInf = new javax.swing.JLabel();
        recebeHoraFimEventoInf = new javax.swing.JLabel();
        recebeAreaEventoInf = new javax.swing.JLabel();
        recebeVagasEventoInf = new javax.swing.JLabel();
        recebeCargaHEventoInf = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        Informação2 = new javax.swing.JLabel();
        jButton30 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        editarEventoAdm = new javax.swing.JPanel();
        inter10 = new javax.swing.JPanel();
        RecebeTxtHoraFimEvento = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        botCancCadAdm6 = new javax.swing.JButton();
        botConfCadIns6 = new javax.swing.JButton();
        RecebeTxtNomeEvento = new javax.swing.JTextField();
        RecebeTxtEnderecoEvento = new javax.swing.JTextField();
        RecebeTxtAreaEvento = new javax.swing.JTextField();
        RecebeTxtDataInicioEvento = new javax.swing.JFormattedTextField();
        jLabel46 = new javax.swing.JLabel();
        RecebeTxtDataFimEvento = new javax.swing.JFormattedTextField();
        RecebeTxtHoraInicioEvento = new javax.swing.JFormattedTextField();
        RecebeTxtHoraFEvento = new javax.swing.JFormattedTextField();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        RecebeTxtCargaHEvento = new javax.swing.JTextField();
        RecebeTxtVagasEvento = new javax.swing.JTextField();
        gerenciarSubEvento = new javax.swing.JPanel();
        inter6 = new javax.swing.JPanel();
        jButton21 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        listaSubEventosPAdm = new javax.swing.JList<>();
        jButton31 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        addSubEventoSistema = new javax.swing.JPanel();
        inter9 = new javax.swing.JPanel();
        selecaoDadosInst4 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        botCancCadAdm4 = new javax.swing.JButton();
        botConfCadIns4 = new javax.swing.JButton();
        espacoTxtNomeSubEvento = new javax.swing.JTextField();
        espacoTxtEnderecoSubEvento = new javax.swing.JTextField();
        espacoTxtNomePalSubEvento = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        espacoTxtDataSubEvento = new javax.swing.JFormattedTextField();
        espacoTxtHInicioSubEvento = new javax.swing.JFormattedTextField();
        espacoTxtHFimSubEvento = new javax.swing.JFormattedTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        espacoTxtVagasSubEvento = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        espacoTxtCargaHSubEvento = new javax.swing.JTextField();
        espacoTxtTelefoneSubEvento = new javax.swing.JFormattedTextField();
        espacoTxtEmailPalSubEvento = new javax.swing.JTextField();
        editarSubEventoAdm = new javax.swing.JPanel();
        inter11 = new javax.swing.JPanel();
        selecaoDadosInst7 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        botCancCadAdm7 = new javax.swing.JButton();
        botConfCadIns7 = new javax.swing.JButton();
        recebeTxtNomeSubEvento = new javax.swing.JTextField();
        recebeTxtEnderecoSubEvento = new javax.swing.JTextField();
        espTxtConfEmailInst5 = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        recebeTxtDataSubEvento = new javax.swing.JFormattedTextField();
        recebeTxtHoraInicioSubEvento = new javax.swing.JFormattedTextField();
        recebeTxtHoraFimSubEvento = new javax.swing.JFormattedTextField();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        recebeTxtVagasSubEvento = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        recebeTxtCargaHSubEvento = new javax.swing.JTextField();
        jFormattedTextField20 = new javax.swing.JFormattedTextField();
        jTextField8 = new javax.swing.JTextField();
        visSubEvento = new javax.swing.JPanel();
        botVoltarGerenciarSubEventoAdm = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        recebeNomeSubEventoInf = new javax.swing.JLabel();
        recebeEnderecoSubEventoInf = new javax.swing.JLabel();
        recebeDataInicioSubEventoInf = new javax.swing.JLabel();
        recebeHoraInicioSubEventoInf = new javax.swing.JLabel();
        recebeHoraFimSubEventoInf = new javax.swing.JLabel();
        recebeVagasSubEventoInf = new javax.swing.JLabel();
        recebeCargaHSubEventoInf = new javax.swing.JLabel();
        recebeCargaHSubEventoInf2 = new javax.swing.JLabel();
        recebeNomePalestrante = new javax.swing.JLabel();
        recebeEmailPalestrante = new javax.swing.JLabel();
        recebeTelefonelPalestrante = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(100, 100));

        jPrincipal.setPreferredSize(new java.awt.Dimension(700, 500));
        jPrincipal.setLayout(new java.awt.CardLayout());

        jMenu.setBackground(new java.awt.Color(110, 139, 152));

        jEscolhaLogin.setBackground(new java.awt.Color(238, 238, 238));
        jEscolhaLogin.setForeground(new java.awt.Color(255, 255, 255));

        jBotLoginAdm.setBackground(new java.awt.Color(28, 73, 92));
        jBotLoginAdm.setForeground(new java.awt.Color(255, 255, 255));
        jBotLoginAdm.setText("Fazer Login");
        jBotLoginAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotLoginAdmActionPerformed(evt);
            }
        });

        jTxtInstituição.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTxtInstituição.setForeground(new java.awt.Color(28, 73, 92));
        jTxtInstituição.setText("Instituição");

        jTxtAluno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTxtAluno.setForeground(new java.awt.Color(28, 73, 92));
        jTxtAluno.setText("Aluno");

        jButton1.setBackground(new java.awt.Color(28, 73, 92));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Fazer Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jEscolhaLoginLayout = new javax.swing.GroupLayout(jEscolhaLogin);
        jEscolhaLogin.setLayout(jEscolhaLoginLayout);
        jEscolhaLoginLayout.setHorizontalGroup(
            jEscolhaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEscolhaLoginLayout.createSequentialGroup()
                .addGroup(jEscolhaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jEscolhaLoginLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jTxtInstituição)
                        .addGap(53, 53, 53)
                        .addComponent(jBotLoginAdm))
                    .addGroup(jEscolhaLoginLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jTxtAluno)
                        .addGap(68, 68, 68)
                        .addComponent(jButton1)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jEscolhaLoginLayout.setVerticalGroup(
            jEscolhaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEscolhaLoginLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jEscolhaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBotLoginAdm)
                    .addComponent(jTxtInstituição))
                .addGap(117, 117, 117)
                .addGroup(jEscolhaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jTxtAluno))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jLabel67.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setText("SISPAC - Sistema para gerenciamento de palestras, atividades e cursos - v1.0");

        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/Frame 36 (1).png"))); // NOI18N

        jLabel69.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setText("A startup SISPAC é um sistema sem");

        jLabel112.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(255, 255, 255));
        jLabel112.setText("fins lucrativos, que tem como objetivo ");

        jLabel113.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel113.setForeground(new java.awt.Color(255, 255, 255));
        jLabel113.setText("facilitar a comunicação entre as ");

        jLabel114.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel114.setForeground(new java.awt.Color(255, 255, 255));
        jLabel114.setText("privado para assim com os seus ");

        jLabel115.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel115.setForeground(new java.awt.Color(255, 255, 255));
        jLabel115.setText("alunos, dessa forma, tornando os ");

        jLabel116.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel116.setForeground(new java.awt.Color(255, 255, 255));
        jLabel116.setText("cursos, palestras e atividades ");

        jLabel117.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel117.setForeground(new java.awt.Color(255, 255, 255));
        jLabel117.setText("ofertadas pelas instituições uma boa ");

        jLabel118.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel118.setForeground(new java.awt.Color(255, 255, 255));
        jLabel118.setText("experiência para os discentes.");

        javax.swing.GroupLayout jMenuLayout = new javax.swing.GroupLayout(jMenu);
        jMenu.setLayout(jMenuLayout);
        jMenuLayout.setHorizontalGroup(
            jMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMenuLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jMenuLayout.createSequentialGroup()
                        .addGroup(jMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jMenuLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel112, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel113, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel114, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel115, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel116, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel117, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel118, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(jEscolhaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addGroup(jMenuLayout.createSequentialGroup()
                        .addComponent(jLabel67)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jMenuLayout.setVerticalGroup(
            jMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jMenuLayout.createSequentialGroup()
                .addGroup(jMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jMenuLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel69)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel112)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel113)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel114)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel115)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel116)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel117)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel118)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jMenuLayout.createSequentialGroup()
                        .addContainerGap(71, Short.MAX_VALUE)
                        .addComponent(jEscolhaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)))
                .addComponent(jLabel67)
                .addContainerGap())
        );

        jPrincipal.add(jMenu, "Menu");

        recuperarSenhaAluno.setBackground(new java.awt.Color(110, 139, 152));
        recuperarSenhaAluno.setPreferredSize(new java.awt.Dimension(700, 500));

        jInserirDadosAdm3.setBackground(new java.awt.Color(255, 255, 255));

        botEntrarAdm4.setBackground(new java.awt.Color(28, 73, 92));
        botEntrarAdm4.setForeground(new java.awt.Color(255, 255, 255));
        botEntrarAdm4.setText("Recuperar");
        botEntrarAdm4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botEntrarAdm4ActionPerformed(evt);
            }
        });

        txtInstucional3.setBackground(new java.awt.Color(255, 255, 255));
        txtInstucional3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        txtInstucional3.setForeground(new java.awt.Color(28, 73, 92));
        txtInstucional3.setText("Aluno");

        espacoTxtRecuperarSenha1.setBackground(new java.awt.Color(255, 255, 255));

        txtEmail3.setForeground(new java.awt.Color(28, 73, 92));
        txtEmail3.setText("Digite seu e-mail");

        botEntrarAdm5.setBackground(new java.awt.Color(201, 90, 65));
        botEntrarAdm5.setForeground(new java.awt.Color(255, 255, 255));
        botEntrarAdm5.setText("Cancelar");
        botEntrarAdm5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botEntrarAdm5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInserirDadosAdm3Layout = new javax.swing.GroupLayout(jInserirDadosAdm3);
        jInserirDadosAdm3.setLayout(jInserirDadosAdm3Layout);
        jInserirDadosAdm3Layout.setHorizontalGroup(
            jInserirDadosAdm3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInserirDadosAdm3Layout.createSequentialGroup()
                .addGroup(jInserirDadosAdm3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInserirDadosAdm3Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jInserirDadosAdm3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInserirDadosAdm3Layout.createSequentialGroup()
                                .addComponent(botEntrarAdm5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(botEntrarAdm4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtEmail3)
                            .addComponent(espacoTxtRecuperarSenha1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jInserirDadosAdm3Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(txtInstucional3)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jInserirDadosAdm3Layout.setVerticalGroup(
            jInserirDadosAdm3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInserirDadosAdm3Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(txtInstucional3)
                .addGap(27, 27, 27)
                .addComponent(txtEmail3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(espacoTxtRecuperarSenha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jInserirDadosAdm3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botEntrarAdm4)
                    .addComponent(botEntrarAdm5))
                .addGap(189, 189, 189))
        );

        javax.swing.GroupLayout recuperarSenhaAlunoLayout = new javax.swing.GroupLayout(recuperarSenhaAluno);
        recuperarSenhaAluno.setLayout(recuperarSenhaAlunoLayout);
        recuperarSenhaAlunoLayout.setHorizontalGroup(
            recuperarSenhaAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recuperarSenhaAlunoLayout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(jInserirDadosAdm3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(209, Short.MAX_VALUE))
        );
        recuperarSenhaAlunoLayout.setVerticalGroup(
            recuperarSenhaAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, recuperarSenhaAlunoLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jInserirDadosAdm3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        jPrincipal.add(recuperarSenhaAluno, "recuperarSenhaAluno");

        jLoginAluno.setBackground(new java.awt.Color(110, 139, 152));

        jInserirDadosAluno.setBackground(new java.awt.Color(255, 255, 255));

        botEntrarAluno.setBackground(new java.awt.Color(28, 73, 92));
        botEntrarAluno.setForeground(new java.awt.Color(255, 255, 255));
        botEntrarAluno.setText("Entrar");
        botEntrarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botEntrarAlunoActionPerformed(evt);
            }
        });

        txtAluno.setBackground(new java.awt.Color(255, 255, 255));
        txtAluno.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        txtAluno.setForeground(new java.awt.Color(28, 73, 92));
        txtAluno.setText("Aluno");

        EspacoTxtEmaiAluno.setBackground(new java.awt.Color(255, 255, 255));

        txtEmailAluno.setForeground(new java.awt.Color(28, 73, 92));
        txtEmailAluno.setText("E-mail");

        txtSenhaAluno.setForeground(new java.awt.Color(28, 73, 92));
        txtSenhaAluno.setText("Senha");

        botMudarLoginAdm.setBackground(new java.awt.Color(238, 238, 238));
        botMudarLoginAdm.setText("Mudar para Login Institucional");
        botMudarLoginAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botMudarLoginAdmActionPerformed(evt);
            }
        });

        TxtSenhaLoginAluno.setBackground(new java.awt.Color(255, 255, 255));

        botEntrarAluno1.setBackground(new java.awt.Color(184, 118, 67));
        botEntrarAluno1.setForeground(new java.awt.Color(255, 255, 255));
        botEntrarAluno1.setText("Recuperar senha");
        botEntrarAluno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botEntrarAluno1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInserirDadosAlunoLayout = new javax.swing.GroupLayout(jInserirDadosAluno);
        jInserirDadosAluno.setLayout(jInserirDadosAlunoLayout);
        jInserirDadosAlunoLayout.setHorizontalGroup(
            jInserirDadosAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInserirDadosAlunoLayout.createSequentialGroup()
                .addGroup(jInserirDadosAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInserirDadosAlunoLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jInserirDadosAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEmailAluno)
                            .addComponent(txtSenhaAluno)
                            .addGroup(jInserirDadosAlunoLayout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(txtAluno))
                            .addComponent(EspacoTxtEmaiAluno)
                            .addComponent(botMudarLoginAdm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(botEntrarAluno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TxtSenhaLoginAluno)))
                    .addGroup(jInserirDadosAlunoLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(botEntrarAluno1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jInserirDadosAlunoLayout.setVerticalGroup(
            jInserirDadosAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInserirDadosAlunoLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(txtAluno)
                .addGap(18, 18, 18)
                .addComponent(txtEmailAluno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EspacoTxtEmaiAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(txtSenhaAluno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtSenhaLoginAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(botEntrarAluno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(botEntrarAluno1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botMudarLoginAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout jLoginAlunoLayout = new javax.swing.GroupLayout(jLoginAluno);
        jLoginAluno.setLayout(jLoginAlunoLayout);
        jLoginAlunoLayout.setHorizontalGroup(
            jLoginAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLoginAlunoLayout.createSequentialGroup()
                .addContainerGap(209, Short.MAX_VALUE)
                .addComponent(jInserirDadosAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(189, 189, 189))
        );
        jLoginAlunoLayout.setVerticalGroup(
            jLoginAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLoginAlunoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jInserirDadosAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPrincipal.add(jLoginAluno, "LoginAluno");

        inter3.setBackground(new java.awt.Color(110, 139, 152));

        jButton37.setBackground(new java.awt.Color(28, 73, 92));
        jButton37.setForeground(new java.awt.Color(255, 255, 255));
        jButton37.setText("Excluir conta");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });

        jButton38.setBackground(new java.awt.Color(28, 73, 92));
        jButton38.setForeground(new java.awt.Color(255, 255, 255));
        jButton38.setText("Editar dados");
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });

        jButton39.setBackground(new java.awt.Color(28, 73, 92));
        jButton39.setForeground(new java.awt.Color(255, 255, 255));
        jButton39.setText("Eventos");
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });

        jButton40.setBackground(new java.awt.Color(201, 90, 65));
        jButton40.setForeground(new java.awt.Color(255, 255, 255));
        jButton40.setText("Sair");
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 532, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout inter3Layout = new javax.swing.GroupLayout(inter3);
        inter3.setLayout(inter3Layout);
        inter3Layout.setHorizontalGroup(
            inter3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inter3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(inter3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton40)
                    .addComponent(jButton39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton37, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        inter3Layout.setVerticalGroup(
            inter3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inter3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton37)
                .addGap(18, 18, 18)
                .addComponent(jButton38)
                .addGap(18, 18, 18)
                .addComponent(jButton39)
                .addGap(35, 35, 35)
                .addComponent(jButton40)
                .addGap(15, 15, 15))
            .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout perfilAlunoLayout = new javax.swing.GroupLayout(perfilAluno);
        perfilAluno.setLayout(perfilAlunoLayout);
        perfilAlunoLayout.setHorizontalGroup(
            perfilAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inter3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        perfilAlunoLayout.setVerticalGroup(
            perfilAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inter3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPrincipal.add(perfilAluno, "perfilAluno");

        editarAlunoSistema.setBackground(new java.awt.Color(110, 139, 152));

        selecaoDadosInst5.setBackground(new java.awt.Color(255, 255, 255));
        selecaoDadosInst5.setPreferredSize(new java.awt.Dimension(585, 440));

        jLabel37.setBackground(new java.awt.Color(255, 255, 255));
        jLabel37.setForeground(new java.awt.Color(28, 73, 92));
        jLabel37.setText("Nome da Instituição");

        jLabel38.setBackground(new java.awt.Color(255, 255, 255));
        jLabel38.setForeground(new java.awt.Color(28, 73, 92));
        jLabel38.setText("CPF");

        jLabel39.setBackground(new java.awt.Color(255, 255, 255));
        jLabel39.setForeground(new java.awt.Color(28, 73, 92));
        jLabel39.setText("E-mail");

        botCancCadAdm5.setBackground(new java.awt.Color(201, 90, 65));
        botCancCadAdm5.setForeground(new java.awt.Color(255, 255, 255));
        botCancCadAdm5.setText("Cancelar");
        botCancCadAdm5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botCancCadAdm5ActionPerformed(evt);
            }
        });

        botConfCadIns5.setBackground(new java.awt.Color(28, 73, 92));
        botConfCadIns5.setForeground(new java.awt.Color(255, 255, 255));
        botConfCadIns5.setText("Confirmar");
        botConfCadIns5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botConfCadIns5ActionPerformed(evt);
            }
        });

        espacoTxtNomeAluno.setBackground(new java.awt.Color(255, 255, 255));

        espacoTxtEmailAluno.setBackground(new java.awt.Color(255, 255, 255));

        novaSenhaAluno.setBackground(new java.awt.Color(255, 255, 255));

        confNovaSenhaAluno.setBackground(new java.awt.Color(255, 255, 255));

        jLabel61.setBackground(new java.awt.Color(255, 255, 255));
        jLabel61.setForeground(new java.awt.Color(28, 73, 92));
        jLabel61.setText("Nova senha");

        jLabel62.setBackground(new java.awt.Color(255, 255, 255));
        jLabel62.setForeground(new java.awt.Color(28, 73, 92));
        jLabel62.setText("Confirme nova senha");

        ConfSenhaAtualAluno.setBackground(new java.awt.Color(255, 255, 255));

        jLabel66.setBackground(new java.awt.Color(255, 255, 255));
        jLabel66.setForeground(new java.awt.Color(28, 73, 92));
        jLabel66.setText("Confirme senha atual");

        espacoTxtCpfAluno.setForeground(new java.awt.Color(226, 40, 33));

        javax.swing.GroupLayout selecaoDadosInst5Layout = new javax.swing.GroupLayout(selecaoDadosInst5);
        selecaoDadosInst5.setLayout(selecaoDadosInst5Layout);
        selecaoDadosInst5Layout.setHorizontalGroup(
            selecaoDadosInst5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selecaoDadosInst5Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(selecaoDadosInst5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(selecaoDadosInst5Layout.createSequentialGroup()
                        .addGroup(selecaoDadosInst5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selecaoDadosInst5Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(espacoTxtNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selecaoDadosInst5Layout.createSequentialGroup()
                                .addGroup(selecaoDadosInst5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selecaoDadosInst5Layout.createSequentialGroup()
                                        .addComponent(botCancCadAdm5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(41, 41, 41))
                                    .addGroup(selecaoDadosInst5Layout.createSequentialGroup()
                                        .addGroup(selecaoDadosInst5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel38)
                                            .addComponent(jLabel37)
                                            .addComponent(jLabel61)
                                            .addComponent(novaSenhaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(selecaoDadosInst5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel62)
                                    .addComponent(confNovaSenhaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botConfCadIns5, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(74, 74, 74))
                    .addGroup(selecaoDadosInst5Layout.createSequentialGroup()
                        .addGroup(selecaoDadosInst5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel39)
                            .addComponent(espacoTxtEmailAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ConfSenhaAtualAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(selecaoDadosInst5Layout.createSequentialGroup()
                        .addGroup(selecaoDadosInst5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel66)
                            .addComponent(espacoTxtCpfAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        selecaoDadosInst5Layout.setVerticalGroup(
            selecaoDadosInst5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selecaoDadosInst5Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(espacoTxtNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(espacoTxtCpfAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(selecaoDadosInst5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(selecaoDadosInst5Layout.createSequentialGroup()
                        .addComponent(espacoTxtEmailAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(jLabel66)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ConfSenhaAtualAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel61)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(novaSenhaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(selecaoDadosInst5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel62)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(confNovaSenhaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(selecaoDadosInst5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botCancCadAdm5)
                    .addComponent(botConfCadIns5))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout editarAlunoSistemaLayout = new javax.swing.GroupLayout(editarAlunoSistema);
        editarAlunoSistema.setLayout(editarAlunoSistemaLayout);
        editarAlunoSistemaLayout.setHorizontalGroup(
            editarAlunoSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editarAlunoSistemaLayout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(selecaoDadosInst5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        editarAlunoSistemaLayout.setVerticalGroup(
            editarAlunoSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editarAlunoSistemaLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(selecaoDadosInst5, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jPrincipal.add(editarAlunoSistema, "editarAlunoSistema");

        inter4.setBackground(new java.awt.Color(110, 139, 152));

        jButton42.setBackground(new java.awt.Color(201, 90, 65));
        jButton42.setForeground(new java.awt.Color(255, 255, 255));
        jButton42.setText("Voltar");
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        listaEventosPAluno.setBackground(new java.awt.Color(255, 255, 255));
        listaEventosPAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaEventosPAlunoMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(listaEventosPAluno);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jButton49.setBackground(new java.awt.Color(28, 73, 92));
        jButton49.setForeground(new java.awt.Color(255, 255, 255));
        jButton49.setText("Visualizar");
        jButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton49ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inter4Layout = new javax.swing.GroupLayout(inter4);
        inter4.setLayout(inter4Layout);
        inter4Layout.setHorizontalGroup(
            inter4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inter4Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(inter4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton42))
                .addGap(18, 18, 18)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        inter4Layout.setVerticalGroup(
            inter4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inter4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton49)
                .addGap(46, 46, 46)
                .addComponent(jButton42)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout eventoAlunoLayout = new javax.swing.GroupLayout(eventoAluno);
        eventoAluno.setLayout(eventoAlunoLayout);
        eventoAlunoLayout.setHorizontalGroup(
            eventoAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inter4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        eventoAlunoLayout.setVerticalGroup(
            eventoAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inter4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPrincipal.add(eventoAluno, "eventoAluno");

        inter1.setBackground(new java.awt.Color(110, 139, 152));

        jButton36.setBackground(new java.awt.Color(201, 90, 65));
        jButton36.setForeground(new java.awt.Color(255, 255, 255));
        jButton36.setText("Voltar");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        Informação.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        Informação.setForeground(new java.awt.Color(28, 73, 92));
        Informação.setText("Informações sobre o evento");

        recebeNomeEventoPAluno.setForeground(new java.awt.Color(68, 108, 125));
        recebeNomeEventoPAluno.setText("NomeEvento");

        recebeEnderecoEventoPAluno.setForeground(new java.awt.Color(68, 108, 125));
        recebeEnderecoEventoPAluno.setText("EnderecoEvento");

        recebeDataInicioEventoPAluno.setForeground(new java.awt.Color(68, 108, 125));
        recebeDataInicioEventoPAluno.setText("DataInicioEvento");

        recebeDataFimEventoPAluno.setForeground(new java.awt.Color(68, 108, 125));
        recebeDataFimEventoPAluno.setText("DataFimEvent");

        recebeHoraInicioEventoPAluno.setForeground(new java.awt.Color(68, 108, 125));
        recebeHoraInicioEventoPAluno.setText("HiniEvento");

        recebeHoraFimEventoPAluno.setForeground(new java.awt.Color(68, 108, 125));
        recebeHoraFimEventoPAluno.setText("HoraFimEvento");

        recebeAreaEventoPAluno.setForeground(new java.awt.Color(68, 108, 125));
        recebeAreaEventoPAluno.setText("AreaEvento");

        recebeVagasEventoPAluno.setForeground(new java.awt.Color(68, 108, 125));
        recebeVagasEventoPAluno.setText("VagasEvento");

        recebeCargaHEventoPAluno.setForeground(new java.awt.Color(68, 108, 125));
        recebeCargaHEventoPAluno.setText("CargaHEvento");

        jLabel70.setForeground(new java.awt.Color(28, 73, 92));
        jLabel70.setText("Nome do evento:");

        jLabel71.setForeground(new java.awt.Color(28, 73, 92));
        jLabel71.setText("Endereço:");

        jLabel72.setForeground(new java.awt.Color(28, 73, 92));
        jLabel72.setText("Data de Inicio:");

        jLabel74.setForeground(new java.awt.Color(28, 73, 92));
        jLabel74.setText("Data de Término:");

        jLabel75.setForeground(new java.awt.Color(28, 73, 92));
        jLabel75.setText("Horário de inicio:");

        jLabel76.setForeground(new java.awt.Color(28, 73, 92));
        jLabel76.setText("Área de ensino:");

        jLabel77.setForeground(new java.awt.Color(28, 73, 92));
        jLabel77.setText("Horário de término:");

        jLabel78.setForeground(new java.awt.Color(28, 73, 92));
        jLabel78.setText("Vagas disponíveis:");

        jLabel79.setForeground(new java.awt.Color(28, 73, 92));
        jLabel79.setText("Carga horária:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel72)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(recebeDataInicioEventoPAluno))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel75)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(recebeHoraInicioEventoPAluno))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel79)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(recebeCargaHEventoPAluno)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel74)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(recebeDataFimEventoPAluno))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel77)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(recebeHoraFimEventoPAluno))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel78)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(recebeVagasEventoPAluno)))
                        .addGap(42, 42, 42))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel71)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(recebeEnderecoEventoPAluno))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel70)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(recebeNomeEventoPAluno))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel76)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(recebeAreaEventoPAluno))
                            .addComponent(Informação))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(Informação)
                .addGap(62, 62, 62)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel70)
                    .addComponent(recebeNomeEventoPAluno))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel72)
                    .addComponent(recebeDataInicioEventoPAluno)
                    .addComponent(jLabel74)
                    .addComponent(recebeDataFimEventoPAluno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel75)
                    .addComponent(recebeHoraInicioEventoPAluno)
                    .addComponent(jLabel77)
                    .addComponent(recebeHoraFimEventoPAluno))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel79)
                    .addComponent(recebeCargaHEventoPAluno)
                    .addComponent(jLabel78)
                    .addComponent(recebeVagasEventoPAluno))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel71)
                    .addComponent(recebeEnderecoEventoPAluno))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76)
                    .addComponent(recebeAreaEventoPAluno))
                .addContainerGap(215, Short.MAX_VALUE))
        );

        jButton50.setBackground(new java.awt.Color(28, 73, 92));
        jButton50.setForeground(new java.awt.Color(255, 255, 255));
        jButton50.setText("Sub-evento");
        jButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton50ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inter1Layout = new javax.swing.GroupLayout(inter1);
        inter1.setLayout(inter1Layout);
        inter1Layout.setHorizontalGroup(
            inter1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inter1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(inter1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inter1Layout.createSequentialGroup()
                        .addComponent(jButton36)
                        .addGap(73, 73, 73))
                    .addComponent(jButton50, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        inter1Layout.setVerticalGroup(
            inter1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inter1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton50)
                .addGap(47, 47, 47)
                .addComponent(jButton36)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout VisEventoAlunoLayout = new javax.swing.GroupLayout(VisEventoAluno);
        VisEventoAluno.setLayout(VisEventoAlunoLayout);
        VisEventoAlunoLayout.setHorizontalGroup(
            VisEventoAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inter1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        VisEventoAlunoLayout.setVerticalGroup(
            VisEventoAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inter1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPrincipal.add(VisEventoAluno, "VisEventoAluno");

        inter7.setBackground(new java.awt.Color(110, 139, 152));

        jButton44.setBackground(new java.awt.Color(28, 73, 92));
        jButton44.setForeground(new java.awt.Color(255, 255, 255));
        jButton44.setText("Visualizar");
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });

        jButton45.setBackground(new java.awt.Color(201, 90, 65));
        jButton45.setForeground(new java.awt.Color(255, 255, 255));
        jButton45.setText("Voltar");
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        listaSubEventosPAluno.setBackground(new java.awt.Color(255, 255, 255));
        listaSubEventosPAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaSubEventosPAlunoMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(listaSubEventosPAluno);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout inter7Layout = new javax.swing.GroupLayout(inter7);
        inter7.setLayout(inter7Layout);
        inter7Layout.setHorizontalGroup(
            inter7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inter7Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(inter7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton45)
                    .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        inter7Layout.setVerticalGroup(
            inter7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inter7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton44)
                .addGap(40, 40, 40)
                .addComponent(jButton45)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout subEventoAlunoLayout = new javax.swing.GroupLayout(subEventoAluno);
        subEventoAluno.setLayout(subEventoAlunoLayout);
        subEventoAlunoLayout.setHorizontalGroup(
            subEventoAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inter7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        subEventoAlunoLayout.setVerticalGroup(
            subEventoAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inter7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPrincipal.add(subEventoAluno, "subEventoAluno");

        inter12.setBackground(new java.awt.Color(110, 139, 152));

        jButton47.setBackground(new java.awt.Color(201, 90, 65));
        jButton47.setForeground(new java.awt.Color(255, 255, 255));
        jButton47.setText("Voltar");
        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));

        recebeNomeSubEventoPAluno.setForeground(new java.awt.Color(68, 108, 125));
        recebeNomeSubEventoPAluno.setText("NomeSubEvento");

        recebeEnderecoSubEventoPAluno.setForeground(new java.awt.Color(68, 108, 125));
        recebeEnderecoSubEventoPAluno.setText("Endereco");

        recebeCargaHSubEventoPAluno.setForeground(new java.awt.Color(68, 108, 125));
        recebeCargaHSubEventoPAluno.setText("CargaHSub");

        recebeDataSubEventoPAluno.setForeground(new java.awt.Color(68, 108, 125));
        recebeDataSubEventoPAluno.setText("DataSu");

        recebeHoraFimSubEventoPAluno.setForeground(new java.awt.Color(68, 108, 125));
        recebeHoraFimSubEventoPAluno.setText("HoraFim");

        recebeVagasSubEventoPAluno.setForeground(new java.awt.Color(68, 108, 125));
        recebeVagasSubEventoPAluno.setText("Vagas");

        recebeHoraInicioSubEventoPAluno.setForeground(new java.awt.Color(68, 108, 125));
        recebeHoraInicioSubEventoPAluno.setText("HoraInicio");

        Informação1.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        Informação1.setForeground(new java.awt.Color(28, 73, 92));
        Informação1.setText("Informações sobre o evento");

        jLabel80.setForeground(new java.awt.Color(28, 73, 92));
        jLabel80.setText("Nome do evento:");

        jLabel81.setForeground(new java.awt.Color(28, 73, 92));
        jLabel81.setText("Endereço:");

        jLabel82.setForeground(new java.awt.Color(28, 73, 92));
        jLabel82.setText("Data:");

        jLabel83.setForeground(new java.awt.Color(28, 73, 92));
        jLabel83.setText("Telefone:");

        jLabel84.setForeground(new java.awt.Color(28, 73, 92));
        jLabel84.setText("Horário de inicio:");

        jLabel85.setForeground(new java.awt.Color(28, 73, 92));
        jLabel85.setText("Nome do palestrante:");

        jLabel86.setForeground(new java.awt.Color(28, 73, 92));
        jLabel86.setText("Horário de término:");

        jLabel87.setForeground(new java.awt.Color(28, 73, 92));
        jLabel87.setText("Vagas disponíveis:");

        jLabel88.setForeground(new java.awt.Color(28, 73, 92));
        jLabel88.setText("Carga horária:");

        jLabel89.setForeground(new java.awt.Color(28, 73, 92));
        jLabel89.setText("E-mail:");

        recebeNomePalestrantePAluno.setForeground(new java.awt.Color(68, 108, 125));
        recebeNomePalestrantePAluno.setText("NomePalestrante");

        recebeTelefonePalestrantePAluno1.setForeground(new java.awt.Color(68, 108, 125));
        recebeTelefonePalestrantePAluno1.setText("TelefonePalestrante");

        recebeEmailPalestrantePAluno2.setForeground(new java.awt.Color(68, 108, 125));
        recebeEmailPalestrantePAluno2.setText("EmailPalestrante");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Informação1)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel84)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(recebeHoraInicioSubEventoPAluno))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel88)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(recebeCargaHSubEventoPAluno)))
                        .addGap(100, 100, 100)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel86)
                            .addComponent(jLabel87))
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(recebeHoraFimSubEventoPAluno)
                            .addComponent(recebeVagasSubEventoPAluno)))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel81)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(recebeEnderecoSubEventoPAluno))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel80)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(recebeNomeSubEventoPAluno))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel82)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(recebeDataSubEventoPAluno))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel85)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(recebeNomePalestrantePAluno))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel83)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(recebeTelefonePalestrantePAluno1))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel89)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(recebeEmailPalestrantePAluno2)))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(Informação1)
                .addGap(62, 62, 62)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel80)
                    .addComponent(recebeNomeSubEventoPAluno))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel82)
                    .addComponent(recebeDataSubEventoPAluno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel84)
                    .addComponent(jLabel86)
                    .addComponent(recebeHoraFimSubEventoPAluno)
                    .addComponent(recebeHoraInicioSubEventoPAluno))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel88)
                    .addComponent(jLabel87)
                    .addComponent(recebeCargaHSubEventoPAluno)
                    .addComponent(recebeVagasSubEventoPAluno))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel81)
                    .addComponent(recebeEnderecoSubEventoPAluno))
                .addGap(56, 56, 56)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel85)
                    .addComponent(recebeNomePalestrantePAluno))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel83)
                    .addComponent(recebeTelefonePalestrantePAluno1))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel89)
                    .addComponent(recebeEmailPalestrantePAluno2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout inter12Layout = new javax.swing.GroupLayout(inter12);
        inter12.setLayout(inter12Layout);
        inter12Layout.setHorizontalGroup(
            inter12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inter12Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jButton47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        inter12Layout.setVerticalGroup(
            inter12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inter12Layout.createSequentialGroup()
                .addContainerGap(464, Short.MAX_VALUE)
                .addComponent(jButton47)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout visSubEventoAlunoLayout = new javax.swing.GroupLayout(visSubEventoAluno);
        visSubEventoAluno.setLayout(visSubEventoAlunoLayout);
        visSubEventoAlunoLayout.setHorizontalGroup(
            visSubEventoAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inter12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        visSubEventoAlunoLayout.setVerticalGroup(
            visSubEventoAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inter12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPrincipal.add(visSubEventoAluno, "visSubEventoAluno");

        cadastroAdm.setBackground(new java.awt.Color(110, 139, 152));
        cadastroAdm.setPreferredSize(new java.awt.Dimension(700, 500));

        selecaoDadosInst.setBackground(new java.awt.Color(255, 255, 255));
        selecaoDadosInst.setPreferredSize(new java.awt.Dimension(585, 440));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(28, 73, 92));
        jLabel1.setText("Nome da Instituição");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(28, 73, 92));
        jLabel2.setText("CNPJ");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setForeground(new java.awt.Color(28, 73, 92));
        jLabel3.setText("E-mail");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(28, 73, 92));
        jLabel4.setText("Confirme o seu e-mail");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(28, 73, 92));
        jLabel5.setText("Senha");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(28, 73, 92));
        jLabel6.setText("Confirme sua Senha");

        botCancCadAdm.setBackground(new java.awt.Color(201, 90, 65));
        botCancCadAdm.setForeground(new java.awt.Color(255, 255, 255));
        botCancCadAdm.setText("Cancelar");
        botCancCadAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botCancCadAdmActionPerformed(evt);
            }
        });

        botConfCadIns.setBackground(new java.awt.Color(28, 73, 92));
        botConfCadIns.setForeground(new java.awt.Color(255, 255, 255));
        botConfCadIns.setText("Confirmar");
        botConfCadIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botConfCadInsActionPerformed(evt);
            }
        });

        espacoTxtNomeIns.setBackground(new java.awt.Color(255, 255, 255));

        espacoTxtEmailCadInst.setBackground(new java.awt.Color(255, 255, 255));

        espTxtConfEmailInst.setBackground(new java.awt.Color(255, 255, 255));

        jPasswordField1.setBackground(new java.awt.Color(255, 255, 255));

        jPasswordField2.setBackground(new java.awt.Color(255, 255, 255));

        txtCnpj.setBackground(new java.awt.Color(255, 255, 255));
        try {
            txtCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout selecaoDadosInstLayout = new javax.swing.GroupLayout(selecaoDadosInst);
        selecaoDadosInst.setLayout(selecaoDadosInstLayout);
        selecaoDadosInstLayout.setHorizontalGroup(
            selecaoDadosInstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selecaoDadosInstLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(selecaoDadosInstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(selecaoDadosInstLayout.createSequentialGroup()
                        .addGroup(selecaoDadosInstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selecaoDadosInstLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(espacoTxtNomeIns, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selecaoDadosInstLayout.createSequentialGroup()
                                .addGroup(selecaoDadosInstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(selecaoDadosInstLayout.createSequentialGroup()
                                        .addComponent(jPasswordField1)
                                        .addGap(41, 41, 41))
                                    .addGroup(selecaoDadosInstLayout.createSequentialGroup()
                                        .addGroup(selecaoDadosInstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(selecaoDadosInstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selecaoDadosInstLayout.createSequentialGroup()
                                .addComponent(botCancCadAdm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(41, 41, 41)
                                .addComponent(botConfCadIns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(74, 74, 74))
                    .addGroup(selecaoDadosInstLayout.createSequentialGroup()
                        .addGroup(selecaoDadosInstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(selecaoDadosInstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(espacoTxtEmailCadInst)
                                .addComponent(espTxtConfEmailInst, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE))
                            .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        selecaoDadosInstLayout.setVerticalGroup(
            selecaoDadosInstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selecaoDadosInstLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(espacoTxtNomeIns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(espacoTxtEmailCadInst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(espTxtConfEmailInst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(selecaoDadosInstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(selecaoDadosInstLayout.createSequentialGroup()
                        .addGroup(selecaoDadosInstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(26, 26, 26))
                    .addGroup(selecaoDadosInstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(selecaoDadosInstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botCancCadAdm)
                    .addComponent(botConfCadIns))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout cadastroAdmLayout = new javax.swing.GroupLayout(cadastroAdm);
        cadastroAdm.setLayout(cadastroAdmLayout);
        cadastroAdmLayout.setHorizontalGroup(
            cadastroAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadastroAdmLayout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(selecaoDadosInst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        cadastroAdmLayout.setVerticalGroup(
            cadastroAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastroAdmLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(selecaoDadosInst, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jPrincipal.add(cadastroAdm, "cadastroAdm");

        recuperarSenhaAdm.setBackground(new java.awt.Color(110, 139, 152));
        recuperarSenhaAdm.setPreferredSize(new java.awt.Dimension(700, 500));

        jInserirDadosAdm2.setBackground(new java.awt.Color(255, 255, 255));

        botRecuperarAdm.setBackground(new java.awt.Color(28, 73, 92));
        botRecuperarAdm.setForeground(new java.awt.Color(255, 255, 255));
        botRecuperarAdm.setText("Recuperar");
        botRecuperarAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botRecuperarAdmActionPerformed(evt);
            }
        });

        txtInstucional2.setBackground(new java.awt.Color(255, 255, 255));
        txtInstucional2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        txtInstucional2.setForeground(new java.awt.Color(28, 73, 92));
        txtInstucional2.setText("Instituição");

        espacoTxtRecuperarSenha.setBackground(new java.awt.Color(255, 255, 255));

        txtEmail2.setForeground(new java.awt.Color(28, 73, 92));
        txtEmail2.setText("Digite seu e-mail");

        botCancRecuperarAdm.setBackground(new java.awt.Color(201, 90, 65));
        botCancRecuperarAdm.setForeground(new java.awt.Color(255, 255, 255));
        botCancRecuperarAdm.setText("Cancelar");
        botCancRecuperarAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botCancRecuperarAdmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInserirDadosAdm2Layout = new javax.swing.GroupLayout(jInserirDadosAdm2);
        jInserirDadosAdm2.setLayout(jInserirDadosAdm2Layout);
        jInserirDadosAdm2Layout.setHorizontalGroup(
            jInserirDadosAdm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInserirDadosAdm2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jInserirDadosAdm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInserirDadosAdm2Layout.createSequentialGroup()
                        .addComponent(botCancRecuperarAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(botRecuperarAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtEmail2)
                    .addComponent(espacoTxtRecuperarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInserirDadosAdm2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtInstucional2)
                .addGap(75, 75, 75))
        );
        jInserirDadosAdm2Layout.setVerticalGroup(
            jInserirDadosAdm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInserirDadosAdm2Layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(txtInstucional2)
                .addGap(35, 35, 35)
                .addComponent(txtEmail2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(espacoTxtRecuperarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jInserirDadosAdm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botRecuperarAdm)
                    .addComponent(botCancRecuperarAdm))
                .addGap(189, 189, 189))
        );

        javax.swing.GroupLayout recuperarSenhaAdmLayout = new javax.swing.GroupLayout(recuperarSenhaAdm);
        recuperarSenhaAdm.setLayout(recuperarSenhaAdmLayout);
        recuperarSenhaAdmLayout.setHorizontalGroup(
            recuperarSenhaAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recuperarSenhaAdmLayout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(jInserirDadosAdm2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(209, Short.MAX_VALUE))
        );
        recuperarSenhaAdmLayout.setVerticalGroup(
            recuperarSenhaAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, recuperarSenhaAdmLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jInserirDadosAdm2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        jPrincipal.add(recuperarSenhaAdm, "recuperarSenha");

        jLoginAdm.setBackground(new java.awt.Color(110, 139, 152));
        jLoginAdm.setPreferredSize(new java.awt.Dimension(700, 500));

        jInserirDadosAdm.setBackground(new java.awt.Color(255, 255, 255));

        botEntrarAdm.setBackground(new java.awt.Color(28, 73, 92));
        botEntrarAdm.setForeground(new java.awt.Color(255, 255, 255));
        botEntrarAdm.setText("Entrar");
        botEntrarAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botEntrarAdmActionPerformed(evt);
            }
        });

        txtInstucional.setBackground(new java.awt.Color(255, 255, 255));
        txtInstucional.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        txtInstucional.setForeground(new java.awt.Color(28, 73, 92));
        txtInstucional.setText("Institucional");

        espacoTxtEmail.setBackground(new java.awt.Color(255, 255, 255));

        botCadastraAdm.setBackground(new java.awt.Color(255, 255, 255));
        botCadastraAdm.setForeground(new java.awt.Color(28, 73, 92));
        botCadastraAdm.setText("cadastrar-se");
        botCadastraAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botCadastraAdmActionPerformed(evt);
            }
        });

        txtEmail.setForeground(new java.awt.Color(28, 73, 92));
        txtEmail.setText("E-mail");

        txtSenha.setForeground(new java.awt.Color(28, 73, 92));
        txtSenha.setText("Senha");

        botMudarLoginAluno.setBackground(new java.awt.Color(238, 238, 238));
        botMudarLoginAluno.setText("Mudar para Login Aluno");
        botMudarLoginAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botMudarLoginAlunoActionPerformed(evt);
            }
        });

        espacoTxtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                espacoTxtSenhaActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(184, 118, 67));
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Recuperar senha");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInserirDadosAdmLayout = new javax.swing.GroupLayout(jInserirDadosAdm);
        jInserirDadosAdm.setLayout(jInserirDadosAdmLayout);
        jInserirDadosAdmLayout.setHorizontalGroup(
            jInserirDadosAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInserirDadosAdmLayout.createSequentialGroup()
                .addGroup(jInserirDadosAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInserirDadosAdmLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(txtInstucional))
                    .addGroup(jInserirDadosAdmLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jInserirDadosAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEmail)
                            .addComponent(espacoTxtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(txtSenha)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInserirDadosAdmLayout.createSequentialGroup()
                                .addComponent(botEntrarAdm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(botCadastraAdm))
                            .addComponent(espacoTxtSenha)
                            .addComponent(botMudarLoginAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jInserirDadosAdmLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jButton8)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jInserirDadosAdmLayout.setVerticalGroup(
            jInserirDadosAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInserirDadosAdmLayout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addComponent(txtInstucional)
                .addGap(29, 29, 29)
                .addComponent(txtEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(espacoTxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(txtSenha)
                .addGap(8, 8, 8)
                .addComponent(espacoTxtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jInserirDadosAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botEntrarAdm)
                    .addComponent(botCadastraAdm))
                .addGap(18, 18, 18)
                .addComponent(jButton8)
                .addGap(11, 11, 11)
                .addComponent(botMudarLoginAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout jLoginAdmLayout = new javax.swing.GroupLayout(jLoginAdm);
        jLoginAdm.setLayout(jLoginAdmLayout);
        jLoginAdmLayout.setHorizontalGroup(
            jLoginAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLoginAdmLayout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(jInserirDadosAdm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(211, Short.MAX_VALUE))
        );
        jLoginAdmLayout.setVerticalGroup(
            jLoginAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLoginAdmLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jInserirDadosAdm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        jPrincipal.add(jLoginAdm, "LoginAdm");

        inter.setBackground(new java.awt.Color(110, 139, 152));

        jButton2.setBackground(new java.awt.Color(28, 73, 92));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Gerenciar conta");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(28, 73, 92));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Gerenciar aluno");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(28, 73, 92));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Gerenciar evento");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(201, 90, 65));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Sair");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout interLayout = new javax.swing.GroupLayout(inter);
        inter.setLayout(interLayout);
        interLayout.setHorizontalGroup(
            interLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(interLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(interLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        interLayout.setVerticalGroup(
            interLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(interLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(38, 38, 38)
                .addComponent(jButton5)
                .addGap(26, 26, 26))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout perfilAdmLayout = new javax.swing.GroupLayout(perfilAdm);
        perfilAdm.setLayout(perfilAdmLayout);
        perfilAdmLayout.setHorizontalGroup(
            perfilAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        perfilAdmLayout.setVerticalGroup(
            perfilAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPrincipal.add(perfilAdm, "perfilAdm");

        gerenciarContaAdm.setBackground(new java.awt.Color(110, 139, 152));

        jButton6.setBackground(new java.awt.Color(28, 73, 92));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Excluir conta");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(28, 73, 92));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Editar dados");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(201, 90, 65));
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Voltar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 511, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout gerenciarContaAdmLayout = new javax.swing.GroupLayout(gerenciarContaAdm);
        gerenciarContaAdm.setLayout(gerenciarContaAdmLayout);
        gerenciarContaAdmLayout.setHorizontalGroup(
            gerenciarContaAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gerenciarContaAdmLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(gerenciarContaAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton9)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        gerenciarContaAdmLayout.setVerticalGroup(
            gerenciarContaAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gerenciarContaAdmLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(18, 18, 18)
                .addComponent(jButton7)
                .addGap(47, 47, 47)
                .addComponent(jButton9)
                .addGap(20, 20, 20))
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPrincipal.add(gerenciarContaAdm, "gerenciarContaAdm");

        editarDadosAdm.setBackground(new java.awt.Color(110, 139, 152));

        selecaoDadosInst1.setBackground(new java.awt.Color(255, 255, 255));
        selecaoDadosInst1.setPreferredSize(new java.awt.Dimension(585, 440));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setForeground(new java.awt.Color(28, 73, 92));
        jLabel7.setText("Nome da Instituição");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setForeground(new java.awt.Color(28, 73, 92));
        jLabel8.setText("CNPJ");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setForeground(new java.awt.Color(28, 73, 92));
        jLabel9.setText("E-mail");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setForeground(new java.awt.Color(28, 73, 92));
        jLabel10.setText("Confirme o seu e-mail");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setForeground(new java.awt.Color(28, 73, 92));
        jLabel11.setText("Senha");

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setForeground(new java.awt.Color(28, 73, 92));
        jLabel12.setText("Confirme sua Senha");

        botCancCadAdm1.setBackground(new java.awt.Color(201, 90, 65));
        botCancCadAdm1.setForeground(new java.awt.Color(255, 255, 255));
        botCancCadAdm1.setText("Cancelar");
        botCancCadAdm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botCancCadAdm1ActionPerformed(evt);
            }
        });

        botConfCadIns1.setBackground(new java.awt.Color(28, 73, 92));
        botConfCadIns1.setForeground(new java.awt.Color(255, 255, 255));
        botConfCadIns1.setText("Confirmar");
        botConfCadIns1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botConfCadIns1ActionPerformed(evt);
            }
        });

        espacoTxtEditarNomeIns.setBackground(new java.awt.Color(255, 255, 255));

        espacoTxtEditarEmailCadInst.setBackground(new java.awt.Color(255, 255, 255));

        espTxtEditarConfEmailInst.setBackground(new java.awt.Color(255, 255, 255));

        senhaEditarIns.setBackground(new java.awt.Color(255, 255, 255));

        confirmarSenhaEditarIns.setBackground(new java.awt.Color(255, 255, 255));

        recebeCnpjIns.setBackground(new java.awt.Color(102, 102, 102));
        recebeCnpjIns.setForeground(new java.awt.Color(226, 40, 33));

        javax.swing.GroupLayout selecaoDadosInst1Layout = new javax.swing.GroupLayout(selecaoDadosInst1);
        selecaoDadosInst1.setLayout(selecaoDadosInst1Layout);
        selecaoDadosInst1Layout.setHorizontalGroup(
            selecaoDadosInst1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selecaoDadosInst1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(selecaoDadosInst1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selecaoDadosInst1Layout.createSequentialGroup()
                        .addGroup(selecaoDadosInst1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(selecaoDadosInst1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(espacoTxtEditarNomeIns, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(selecaoDadosInst1Layout.createSequentialGroup()
                                .addGroup(selecaoDadosInst1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel11)
                                    .addComponent(senhaEditarIns, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(selecaoDadosInst1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(confirmarSenhaEditarIns, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(selecaoDadosInst1Layout.createSequentialGroup()
                                .addComponent(botCancCadAdm1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(45, 45, 45)
                                .addComponent(botConfCadIns1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(74, 74, 74))
                    .addGroup(selecaoDadosInst1Layout.createSequentialGroup()
                        .addGroup(selecaoDadosInst1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(selecaoDadosInst1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel10)
                                .addComponent(jLabel9)
                                .addComponent(espacoTxtEditarEmailCadInst)
                                .addComponent(espTxtEditarConfEmailInst, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE))
                            .addComponent(recebeCnpjIns, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        selecaoDadosInst1Layout.setVerticalGroup(
            selecaoDadosInst1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selecaoDadosInst1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(espacoTxtEditarNomeIns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(recebeCnpjIns, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(espacoTxtEditarEmailCadInst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(espTxtEditarConfEmailInst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(selecaoDadosInst1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(selecaoDadosInst1Layout.createSequentialGroup()
                        .addGroup(selecaoDadosInst1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(26, 26, 26))
                    .addGroup(selecaoDadosInst1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(senhaEditarIns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(confirmarSenhaEditarIns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(selecaoDadosInst1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botCancCadAdm1)
                    .addComponent(botConfCadIns1))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout editarDadosAdmLayout = new javax.swing.GroupLayout(editarDadosAdm);
        editarDadosAdm.setLayout(editarDadosAdmLayout);
        editarDadosAdmLayout.setHorizontalGroup(
            editarDadosAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editarDadosAdmLayout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(selecaoDadosInst1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        editarDadosAdmLayout.setVerticalGroup(
            editarDadosAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editarDadosAdmLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(selecaoDadosInst1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jPrincipal.add(editarDadosAdm, "editarDadosAdm");

        gerenciarAlunoAdm.setBackground(new java.awt.Color(110, 139, 152));

        jButton17.setBackground(new java.awt.Color(201, 90, 65));
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setText("Voltar");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        botAddAlunoPAdm.setBackground(new java.awt.Color(28, 73, 92));
        botAddAlunoPAdm.setForeground(new java.awt.Color(255, 255, 255));
        botAddAlunoPAdm.setText("Adicionar aluno");
        botAddAlunoPAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botAddAlunoPAdmActionPerformed(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        listaAlunosPAdm.setBackground(new java.awt.Color(255, 255, 255));
        listaAlunosPAdm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaAlunosPAdmMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listaAlunosPAdm);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        botExcluirAlunoPAdm.setBackground(new java.awt.Color(28, 73, 92));
        botExcluirAlunoPAdm.setForeground(new java.awt.Color(255, 255, 255));
        botExcluirAlunoPAdm.setText("Excluir");
        botExcluirAlunoPAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botExcluirAlunoPAdmActionPerformed(evt);
            }
        });

        botExcluirAlunoPAdm1.setBackground(new java.awt.Color(28, 73, 92));
        botExcluirAlunoPAdm1.setForeground(new java.awt.Color(255, 255, 255));
        botExcluirAlunoPAdm1.setText("Visualizar");
        botExcluirAlunoPAdm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botExcluirAlunoPAdm1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gerenciarAlunoAdmLayout = new javax.swing.GroupLayout(gerenciarAlunoAdm);
        gerenciarAlunoAdm.setLayout(gerenciarAlunoAdmLayout);
        gerenciarAlunoAdmLayout.setHorizontalGroup(
            gerenciarAlunoAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gerenciarAlunoAdmLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(gerenciarAlunoAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton17)
                    .addComponent(botExcluirAlunoPAdm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                    .addComponent(botExcluirAlunoPAdm1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                    .addComponent(botAddAlunoPAdm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        gerenciarAlunoAdmLayout.setVerticalGroup(
            gerenciarAlunoAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gerenciarAlunoAdmLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botExcluirAlunoPAdm1)
                .addGap(18, 18, 18)
                .addComponent(botExcluirAlunoPAdm)
                .addGap(18, 18, 18)
                .addComponent(botAddAlunoPAdm)
                .addGap(45, 45, 45)
                .addComponent(jButton17)
                .addGap(24, 24, 24))
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPrincipal.add(gerenciarAlunoAdm, "gerenciarAlunoAdm");

        addAlunoSistema.setBackground(new java.awt.Color(110, 139, 152));

        selecaoDadosInst2.setBackground(new java.awt.Color(255, 255, 255));
        selecaoDadosInst2.setPreferredSize(new java.awt.Dimension(585, 440));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setForeground(new java.awt.Color(28, 73, 92));
        jLabel13.setText("Nome do aluno");

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setForeground(new java.awt.Color(28, 73, 92));
        jLabel14.setText("CPF");

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setForeground(new java.awt.Color(28, 73, 92));
        jLabel15.setText("E-mail");

        botCancCadAdm2.setBackground(new java.awt.Color(201, 90, 65));
        botCancCadAdm2.setForeground(new java.awt.Color(255, 255, 255));
        botCancCadAdm2.setText("Cancelar");
        botCancCadAdm2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botCancCadAdm2ActionPerformed(evt);
            }
        });

        botConfCadIns2.setBackground(new java.awt.Color(28, 73, 92));
        botConfCadIns2.setForeground(new java.awt.Color(255, 255, 255));
        botConfCadIns2.setText("Confirmar");
        botConfCadIns2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botConfCadIns2ActionPerformed(evt);
            }
        });

        espacoTxtNomeAlunoPAdm.setBackground(new java.awt.Color(255, 255, 255));

        espacoTxtEmailAlunoPAdm.setBackground(new java.awt.Color(255, 255, 255));

        espacoTxtCpfAlunoPAdm.setBackground(new java.awt.Color(255, 255, 255));
        try {
            espacoTxtCpfAlunoPAdm.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout selecaoDadosInst2Layout = new javax.swing.GroupLayout(selecaoDadosInst2);
        selecaoDadosInst2.setLayout(selecaoDadosInst2Layout);
        selecaoDadosInst2Layout.setHorizontalGroup(
            selecaoDadosInst2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selecaoDadosInst2Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(selecaoDadosInst2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(selecaoDadosInst2Layout.createSequentialGroup()
                        .addGroup(selecaoDadosInst2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selecaoDadosInst2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(espacoTxtNomeAlunoPAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selecaoDadosInst2Layout.createSequentialGroup()
                                .addGroup(selecaoDadosInst2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(selecaoDadosInst2Layout.createSequentialGroup()
                                        .addComponent(botCancCadAdm2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(41, 41, 41))
                                    .addGroup(selecaoDadosInst2Layout.createSequentialGroup()
                                        .addGroup(selecaoDadosInst2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel13))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(botConfCadIns2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(74, 74, 74))
                    .addGroup(selecaoDadosInst2Layout.createSequentialGroup()
                        .addGroup(selecaoDadosInst2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(espacoTxtEmailAlunoPAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(espacoTxtCpfAlunoPAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        selecaoDadosInst2Layout.setVerticalGroup(
            selecaoDadosInst2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selecaoDadosInst2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(espacoTxtNomeAlunoPAdm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(espacoTxtCpfAlunoPAdm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(espacoTxtEmailAlunoPAdm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114)
                .addGroup(selecaoDadosInst2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botCancCadAdm2)
                    .addComponent(botConfCadIns2))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout addAlunoSistemaLayout = new javax.swing.GroupLayout(addAlunoSistema);
        addAlunoSistema.setLayout(addAlunoSistemaLayout);
        addAlunoSistemaLayout.setHorizontalGroup(
            addAlunoSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addAlunoSistemaLayout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(selecaoDadosInst2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        addAlunoSistemaLayout.setVerticalGroup(
            addAlunoSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addAlunoSistemaLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(selecaoDadosInst2, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        jPrincipal.add(addAlunoSistema, "addAlunoSistema");

        visAlunoAdm.setBackground(new java.awt.Color(110, 139, 152));

        jButton27.setBackground(new java.awt.Color(201, 90, 65));
        jButton27.setForeground(new java.awt.Color(255, 255, 255));
        jButton27.setText("Voltar");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jLabel73.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(28, 73, 92));
        jLabel73.setText("Informações do aluno");

        recebeNomeAluno.setForeground(new java.awt.Color(68, 108, 125));
        recebeNomeAluno.setText("Nome");

        recebeEmailAluno.setForeground(new java.awt.Color(68, 108, 125));
        recebeEmailAluno.setText("Email");

        recebeCpfAluno.setForeground(new java.awt.Color(68, 108, 125));
        recebeCpfAluno.setText("CPF");

        jLabel90.setForeground(new java.awt.Color(28, 73, 92));
        jLabel90.setText("Nome do aluno:");

        jLabel91.setForeground(new java.awt.Color(28, 73, 92));
        jLabel91.setText("CPF:");

        jLabel92.setForeground(new java.awt.Color(28, 73, 92));
        jLabel92.setText("E-mail:");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel92)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(recebeEmailAluno))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel90)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(recebeNomeAluno))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel91)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(recebeCpfAluno))
                    .addComponent(jLabel73))
                .addContainerGap(295, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel73)
                .addGap(48, 48, 48)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel90)
                    .addComponent(recebeNomeAluno))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel91)
                    .addComponent(recebeCpfAluno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel92)
                    .addComponent(recebeEmailAluno))
                .addContainerGap(327, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout visAlunoAdmLayout = new javax.swing.GroupLayout(visAlunoAdm);
        visAlunoAdm.setLayout(visAlunoAdmLayout);
        visAlunoAdmLayout.setHorizontalGroup(
            visAlunoAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(visAlunoAdmLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton27)
                .addGap(87, 87, 87)
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        visAlunoAdmLayout.setVerticalGroup(
            visAlunoAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(visAlunoAdmLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton27)
                .addGap(15, 15, 15))
            .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPrincipal.add(visAlunoAdm, "visAlunoAdm");

        inter8.setBackground(new java.awt.Color(110, 139, 152));

        selecaoDadosInst3.setBackground(new java.awt.Color(255, 255, 255));
        selecaoDadosInst3.setPreferredSize(new java.awt.Dimension(585, 440));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setForeground(new java.awt.Color(28, 73, 92));
        jLabel16.setText("Nome do evento");

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setForeground(new java.awt.Color(28, 73, 92));
        jLabel17.setText("Data inicio");

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setForeground(new java.awt.Color(28, 73, 92));
        jLabel18.setText("Local");

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setForeground(new java.awt.Color(28, 73, 92));
        jLabel19.setText("Área de ensino");

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setForeground(new java.awt.Color(28, 73, 92));
        jLabel20.setText("Carga horária");

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setForeground(new java.awt.Color(28, 73, 92));
        jLabel21.setText("Vagas");

        botCancCadAdm3.setBackground(new java.awt.Color(201, 90, 65));
        botCancCadAdm3.setForeground(new java.awt.Color(255, 255, 255));
        botCancCadAdm3.setText("Cancelar");
        botCancCadAdm3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botCancCadAdm3ActionPerformed(evt);
            }
        });

        botConfCadIns3.setBackground(new java.awt.Color(28, 73, 92));
        botConfCadIns3.setForeground(new java.awt.Color(255, 255, 255));
        botConfCadIns3.setText("Confirmar");
        botConfCadIns3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botConfCadIns3ActionPerformed(evt);
            }
        });

        espacoTxtNomeEvento.setBackground(new java.awt.Color(255, 255, 255));

        espacoTxtEnderecoEventoInst.setBackground(new java.awt.Color(255, 255, 255));

        espTxtAreaEnsinoEvento.setBackground(new java.awt.Color(255, 255, 255));

        dataEventoinicio.setBackground(new java.awt.Color(255, 255, 255));
        try {
            dataEventoinicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setForeground(new java.awt.Color(28, 73, 92));
        jLabel22.setText("Data término");

        dataEventoFim.setBackground(new java.awt.Color(255, 255, 255));
        try {
            dataEventoFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        HorInicioEvento.setBackground(new java.awt.Color(255, 255, 255));
        try {
            HorInicioEvento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        HorFiimEvento.setBackground(new java.awt.Color(255, 255, 255));
        try {
            HorFiimEvento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setForeground(new java.awt.Color(28, 73, 92));
        jLabel23.setText("Horário inicio");

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setForeground(new java.awt.Color(28, 73, 92));
        jLabel24.setText("Horário término");

        espTxtCargaHEvento.setBackground(new java.awt.Color(255, 255, 255));

        espTxtVagasEvento.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout selecaoDadosInst3Layout = new javax.swing.GroupLayout(selecaoDadosInst3);
        selecaoDadosInst3.setLayout(selecaoDadosInst3Layout);
        selecaoDadosInst3Layout.setHorizontalGroup(
            selecaoDadosInst3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selecaoDadosInst3Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(selecaoDadosInst3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(selecaoDadosInst3Layout.createSequentialGroup()
                        .addGroup(selecaoDadosInst3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selecaoDadosInst3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(espacoTxtNomeEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selecaoDadosInst3Layout.createSequentialGroup()
                                .addGroup(selecaoDadosInst3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel20)
                                    .addComponent(espTxtCargaHEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(selecaoDadosInst3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(dataEventoFim, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(selecaoDadosInst3Layout.createSequentialGroup()
                                            .addComponent(jLabel17)
                                            .addGap(53, 53, 53)
                                            .addComponent(jLabel22))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(selecaoDadosInst3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addGroup(selecaoDadosInst3Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel23)))
                                .addGap(121, 121, 121)))
                        .addGap(74, 74, 74))
                    .addGroup(selecaoDadosInst3Layout.createSequentialGroup()
                        .addGroup(selecaoDadosInst3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(espTxtVagasEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(selecaoDadosInst3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selecaoDadosInst3Layout.createSequentialGroup()
                                    .addComponent(botCancCadAdm3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(41, 41, 41)
                                    .addComponent(botConfCadIns3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel19)
                                .addComponent(jLabel18)
                                .addComponent(espacoTxtEnderecoEventoInst)
                                .addComponent(espTxtAreaEnsinoEvento, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selecaoDadosInst3Layout.createSequentialGroup()
                                    .addComponent(dataEventoinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(HorInicioEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(selecaoDadosInst3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(HorFiimEvento)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        selecaoDadosInst3Layout.setVerticalGroup(
            selecaoDadosInst3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selecaoDadosInst3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(espacoTxtNomeEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(selecaoDadosInst3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(selecaoDadosInst3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataEventoinicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataEventoFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HorInicioEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HorFiimEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(espacoTxtEnderecoEventoInst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(espTxtAreaEnsinoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(selecaoDadosInst3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(selecaoDadosInst3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(espTxtCargaHEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(espTxtVagasEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(selecaoDadosInst3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botCancCadAdm3)
                    .addComponent(botConfCadIns3))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout inter8Layout = new javax.swing.GroupLayout(inter8);
        inter8.setLayout(inter8Layout);
        inter8Layout.setHorizontalGroup(
            inter8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inter8Layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(selecaoDadosInst3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        inter8Layout.setVerticalGroup(
            inter8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inter8Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(selecaoDadosInst3, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout addEventoSistemaLayout = new javax.swing.GroupLayout(addEventoSistema);
        addEventoSistema.setLayout(addEventoSistemaLayout);
        addEventoSistemaLayout.setHorizontalGroup(
            addEventoSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inter8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        addEventoSistemaLayout.setVerticalGroup(
            addEventoSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inter8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPrincipal.add(addEventoSistema, "addEventoSistema");

        gerenciarEventoAdm.setPreferredSize(new java.awt.Dimension(700, 514));

        inter5.setBackground(new java.awt.Color(110, 139, 152));

        jButton18.setBackground(new java.awt.Color(201, 90, 65));
        jButton18.setForeground(new java.awt.Color(255, 255, 255));
        jButton18.setText("Voltar");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        listaEventosPAdm.setBackground(new java.awt.Color(255, 255, 255));
        listaEventosPAdm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaEventosPAdmMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(listaEventosPAdm);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jButton19.setBackground(new java.awt.Color(28, 73, 92));
        jButton19.setForeground(new java.awt.Color(255, 255, 255));
        jButton19.setText("Adicionar evento");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton16.setBackground(new java.awt.Color(28, 73, 92));
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setText("Visualizar");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton35.setBackground(new java.awt.Color(28, 73, 92));
        jButton35.setForeground(new java.awt.Color(255, 255, 255));
        jButton35.setText("Editar");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        jButton41.setBackground(new java.awt.Color(28, 73, 92));
        jButton41.setForeground(new java.awt.Color(255, 255, 255));
        jButton41.setText("Excluir");
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inter5Layout = new javax.swing.GroupLayout(inter5);
        inter5.setLayout(inter5Layout);
        inter5Layout.setHorizontalGroup(
            inter5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inter5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(inter5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton18, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton41, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton35, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        inter5Layout.setVerticalGroup(
            inter5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inter5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton16)
                .addGap(18, 18, 18)
                .addComponent(jButton41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton35)
                .addGap(18, 18, 18)
                .addComponent(jButton19)
                .addGap(43, 43, 43)
                .addComponent(jButton18)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout gerenciarEventoAdmLayout = new javax.swing.GroupLayout(gerenciarEventoAdm);
        gerenciarEventoAdm.setLayout(gerenciarEventoAdmLayout);
        gerenciarEventoAdmLayout.setHorizontalGroup(
            gerenciarEventoAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inter5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        gerenciarEventoAdmLayout.setVerticalGroup(
            gerenciarEventoAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inter5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPrincipal.add(gerenciarEventoAdm, "gerenciarEventoAdm");

        visEventoAdm.setBackground(new java.awt.Color(110, 139, 152));

        jButton23.setBackground(new java.awt.Color(28, 73, 92));
        jButton23.setForeground(new java.awt.Color(255, 255, 255));
        jButton23.setText("Gerar relatório");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setBackground(new java.awt.Color(201, 90, 65));
        jButton24.setForeground(new java.awt.Color(255, 255, 255));
        jButton24.setText("Voltar");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        recebeNomeEventoInf.setForeground(new java.awt.Color(68, 108, 125));
        recebeNomeEventoInf.setText("NomeEvento");

        recebeEnderecoEventoInf.setForeground(new java.awt.Color(68, 108, 125));
        recebeEnderecoEventoInf.setText("EnderecoEvento");

        recebeDataInicioEventoInf.setForeground(new java.awt.Color(68, 108, 125));
        recebeDataInicioEventoInf.setText("DataInicio");

        recebeDataFimEventoInf.setForeground(new java.awt.Color(68, 108, 125));
        recebeDataFimEventoInf.setText("DataFim");

        recebeHoraInicioEventoInf.setForeground(new java.awt.Color(68, 108, 125));
        recebeHoraInicioEventoInf.setText("HoraInicio");

        recebeHoraFimEventoInf.setForeground(new java.awt.Color(68, 108, 125));
        recebeHoraFimEventoInf.setText("HoraFim");

        recebeAreaEventoInf.setForeground(new java.awt.Color(68, 108, 125));
        recebeAreaEventoInf.setText("Area");

        recebeVagasEventoInf.setForeground(new java.awt.Color(68, 108, 125));
        recebeVagasEventoInf.setText("Vagas");

        recebeCargaHEventoInf.setForeground(new java.awt.Color(68, 108, 125));
        recebeCargaHEventoInf.setText("CargaH");

        jLabel99.setForeground(new java.awt.Color(28, 73, 92));
        jLabel99.setText("Vagas disponíveis:");

        jLabel95.setForeground(new java.awt.Color(28, 73, 92));
        jLabel95.setText("Horário de inicio:");

        jLabel97.setForeground(new java.awt.Color(28, 73, 92));
        jLabel97.setText("Endereço:");

        jLabel100.setForeground(new java.awt.Color(28, 73, 92));
        jLabel100.setText("Horário de término:");

        jLabel98.setForeground(new java.awt.Color(28, 73, 92));
        jLabel98.setText("Área de ensino:");

        jLabel101.setForeground(new java.awt.Color(28, 73, 92));
        jLabel101.setText("Data de Término:");

        jLabel93.setForeground(new java.awt.Color(28, 73, 92));
        jLabel93.setText("Nome do evento:");

        jLabel96.setForeground(new java.awt.Color(28, 73, 92));
        jLabel96.setText("Carga horária:");

        jLabel94.setForeground(new java.awt.Color(28, 73, 92));
        jLabel94.setText("Data de Inicio:");

        Informação2.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        Informação2.setForeground(new java.awt.Color(28, 73, 92));
        Informação2.setText("Informações sobre o evento");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel98)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(recebeAreaEventoInf))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel93)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(recebeNomeEventoInf))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel97)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(recebeEnderecoEventoInf)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Informação2)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(jLabel94)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(recebeDataInicioEventoInf))
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(jLabel95)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(recebeHoraInicioEventoInf))
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(jLabel96)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(recebeCargaHEventoInf)))
                                .addGap(74, 74, 74)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(jLabel101)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(recebeDataFimEventoInf))
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(jLabel99)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(recebeVagasEventoInf))
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(jLabel100)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(recebeHoraFimEventoInf)))))
                        .addGap(0, 83, Short.MAX_VALUE))))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(Informação2)
                .addGap(53, 53, 53)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel93)
                    .addComponent(recebeNomeEventoInf))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel94)
                    .addComponent(jLabel101)
                    .addComponent(recebeDataInicioEventoInf)
                    .addComponent(recebeDataFimEventoInf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel95)
                    .addComponent(jLabel100)
                    .addComponent(recebeHoraFimEventoInf)
                    .addComponent(recebeHoraInicioEventoInf))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel96)
                    .addComponent(jLabel99)
                    .addComponent(recebeVagasEventoInf)
                    .addComponent(recebeCargaHEventoInf))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel97)
                    .addComponent(recebeEnderecoEventoInf))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel98)
                    .addComponent(recebeAreaEventoInf))
                .addContainerGap(232, Short.MAX_VALUE))
        );

        jButton30.setBackground(new java.awt.Color(28, 73, 92));
        jButton30.setForeground(new java.awt.Color(255, 255, 255));
        jButton30.setText("Divulgar");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jButton48.setBackground(new java.awt.Color(28, 73, 92));
        jButton48.setForeground(new java.awt.Color(255, 255, 255));
        jButton48.setText("Sub-Evento");
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });

        jButton32.setBackground(new java.awt.Color(28, 73, 92));
        jButton32.setForeground(new java.awt.Color(255, 255, 255));
        jButton32.setText("Add sub-evento");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout visEventoAdmLayout = new javax.swing.GroupLayout(visEventoAdm);
        visEventoAdm.setLayout(visEventoAdmLayout);
        visEventoAdmLayout.setHorizontalGroup(
            visEventoAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(visEventoAdmLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(visEventoAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(visEventoAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton48, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton30, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                    .addComponent(jButton24)
                    .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        visEventoAdmLayout.setVerticalGroup(
            visEventoAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, visEventoAdmLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton32)
                .addGap(18, 18, 18)
                .addComponent(jButton48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton23)
                .addGap(37, 37, 37)
                .addComponent(jButton24)
                .addGap(20, 20, 20))
        );

        jPrincipal.add(visEventoAdm, "visEventoAdm");

        inter10.setBackground(new java.awt.Color(110, 139, 152));

        RecebeTxtHoraFimEvento.setBackground(new java.awt.Color(255, 255, 255));
        RecebeTxtHoraFimEvento.setPreferredSize(new java.awt.Dimension(585, 440));

        jLabel40.setBackground(new java.awt.Color(255, 255, 255));
        jLabel40.setForeground(new java.awt.Color(28, 73, 92));
        jLabel40.setText("Nome do evento");

        jLabel41.setBackground(new java.awt.Color(255, 255, 255));
        jLabel41.setForeground(new java.awt.Color(28, 73, 92));
        jLabel41.setText("Data inicio");

        jLabel42.setBackground(new java.awt.Color(255, 255, 255));
        jLabel42.setForeground(new java.awt.Color(28, 73, 92));
        jLabel42.setText("Local");

        jLabel43.setBackground(new java.awt.Color(255, 255, 255));
        jLabel43.setForeground(new java.awt.Color(28, 73, 92));
        jLabel43.setText("Área de ensino");

        jLabel44.setBackground(new java.awt.Color(255, 255, 255));
        jLabel44.setForeground(new java.awt.Color(28, 73, 92));
        jLabel44.setText("Carga horária");

        jLabel45.setBackground(new java.awt.Color(255, 255, 255));
        jLabel45.setForeground(new java.awt.Color(28, 73, 92));
        jLabel45.setText("Vagas");

        botCancCadAdm6.setBackground(new java.awt.Color(201, 90, 65));
        botCancCadAdm6.setForeground(new java.awt.Color(255, 255, 255));
        botCancCadAdm6.setText("Cancelar");
        botCancCadAdm6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botCancCadAdm6ActionPerformed(evt);
            }
        });

        botConfCadIns6.setBackground(new java.awt.Color(28, 73, 92));
        botConfCadIns6.setForeground(new java.awt.Color(255, 255, 255));
        botConfCadIns6.setText("Confirmar");
        botConfCadIns6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botConfCadIns6ActionPerformed(evt);
            }
        });

        RecebeTxtNomeEvento.setBackground(new java.awt.Color(255, 255, 255));

        RecebeTxtEnderecoEvento.setBackground(new java.awt.Color(255, 255, 255));

        RecebeTxtAreaEvento.setBackground(new java.awt.Color(255, 255, 255));

        RecebeTxtDataInicioEvento.setBackground(new java.awt.Color(255, 255, 255));
        try {
            RecebeTxtDataInicioEvento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel46.setBackground(new java.awt.Color(255, 255, 255));
        jLabel46.setForeground(new java.awt.Color(28, 73, 92));
        jLabel46.setText("Data término");

        RecebeTxtDataFimEvento.setBackground(new java.awt.Color(255, 255, 255));
        try {
            RecebeTxtDataFimEvento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        RecebeTxtHoraInicioEvento.setBackground(new java.awt.Color(255, 255, 255));
        try {
            RecebeTxtHoraInicioEvento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        RecebeTxtHoraFEvento.setBackground(new java.awt.Color(255, 255, 255));
        try {
            RecebeTxtHoraFEvento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel47.setBackground(new java.awt.Color(255, 255, 255));
        jLabel47.setForeground(new java.awt.Color(28, 73, 92));
        jLabel47.setText("Horário inicio");

        jLabel48.setBackground(new java.awt.Color(255, 255, 255));
        jLabel48.setForeground(new java.awt.Color(28, 73, 92));
        jLabel48.setText("Horário término");

        RecebeTxtCargaHEvento.setBackground(new java.awt.Color(255, 255, 255));

        RecebeTxtVagasEvento.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout RecebeTxtHoraFimEventoLayout = new javax.swing.GroupLayout(RecebeTxtHoraFimEvento);
        RecebeTxtHoraFimEvento.setLayout(RecebeTxtHoraFimEventoLayout);
        RecebeTxtHoraFimEventoLayout.setHorizontalGroup(
            RecebeTxtHoraFimEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RecebeTxtHoraFimEventoLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(RecebeTxtHoraFimEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RecebeTxtHoraFimEventoLayout.createSequentialGroup()
                        .addGroup(RecebeTxtHoraFimEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RecebeTxtHoraFimEventoLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(RecebeTxtNomeEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RecebeTxtHoraFimEventoLayout.createSequentialGroup()
                                .addGroup(RecebeTxtHoraFimEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(RecebeTxtHoraFimEventoLayout.createSequentialGroup()
                                        .addGroup(RecebeTxtHoraFimEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(RecebeTxtDataFimEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(RecebeTxtHoraFimEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel40)
                                                .addComponent(jLabel44)
                                                .addGroup(RecebeTxtHoraFimEventoLayout.createSequentialGroup()
                                                    .addComponent(jLabel41)
                                                    .addGap(53, 53, 53)
                                                    .addComponent(jLabel46))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(RecebeTxtHoraFimEventoLayout.createSequentialGroup()
                                        .addGroup(RecebeTxtHoraFimEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(RecebeTxtCargaHEvento, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(botCancCadAdm6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(47, 47, 47)))
                                .addGroup(RecebeTxtHoraFimEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel45)
                                    .addGroup(RecebeTxtHoraFimEventoLayout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel47))
                                    .addComponent(botConfCadIns6, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                    .addComponent(RecebeTxtVagasEvento))))
                        .addGap(74, 74, 74))
                    .addGroup(RecebeTxtHoraFimEventoLayout.createSequentialGroup()
                        .addGroup(RecebeTxtHoraFimEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel43)
                            .addComponent(jLabel42)
                            .addComponent(RecebeTxtEnderecoEvento)
                            .addComponent(RecebeTxtAreaEvento, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RecebeTxtHoraFimEventoLayout.createSequentialGroup()
                                .addComponent(RecebeTxtDataInicioEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(RecebeTxtHoraInicioEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(RecebeTxtHoraFimEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(RecebeTxtHoraFEvento))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        RecebeTxtHoraFimEventoLayout.setVerticalGroup(
            RecebeTxtHoraFimEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RecebeTxtHoraFimEventoLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RecebeTxtNomeEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(RecebeTxtHoraFimEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(jLabel46)
                    .addComponent(jLabel47)
                    .addComponent(jLabel48))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RecebeTxtHoraFimEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RecebeTxtDataInicioEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RecebeTxtDataFimEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RecebeTxtHoraInicioEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RecebeTxtHoraFEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RecebeTxtEnderecoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RecebeTxtAreaEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(RecebeTxtHoraFimEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(jLabel45))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RecebeTxtHoraFimEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RecebeTxtCargaHEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RecebeTxtVagasEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RecebeTxtHoraFimEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botCancCadAdm6)
                    .addComponent(botConfCadIns6))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout inter10Layout = new javax.swing.GroupLayout(inter10);
        inter10.setLayout(inter10Layout);
        inter10Layout.setHorizontalGroup(
            inter10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inter10Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(RecebeTxtHoraFimEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        inter10Layout.setVerticalGroup(
            inter10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inter10Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(RecebeTxtHoraFimEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout editarEventoAdmLayout = new javax.swing.GroupLayout(editarEventoAdm);
        editarEventoAdm.setLayout(editarEventoAdmLayout);
        editarEventoAdmLayout.setHorizontalGroup(
            editarEventoAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inter10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        editarEventoAdmLayout.setVerticalGroup(
            editarEventoAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inter10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPrincipal.add(editarEventoAdm, "editarEventoAdm");

        inter6.setBackground(new java.awt.Color(110, 139, 152));

        jButton21.setBackground(new java.awt.Color(201, 90, 65));
        jButton21.setForeground(new java.awt.Color(255, 255, 255));
        jButton21.setText("Voltar");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        listaSubEventosPAdm.setBackground(new java.awt.Color(255, 255, 255));
        listaSubEventosPAdm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaSubEventosPAdmMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(listaSubEventosPAdm);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jButton31.setBackground(new java.awt.Color(28, 73, 92));
        jButton31.setForeground(new java.awt.Color(255, 255, 255));
        jButton31.setText("Editar sub-evento");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jButton28.setBackground(new java.awt.Color(28, 73, 92));
        jButton28.setForeground(new java.awt.Color(255, 255, 255));
        jButton28.setText("Visualizar");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inter6Layout = new javax.swing.GroupLayout(inter6);
        inter6.setLayout(inter6Layout);
        inter6Layout.setHorizontalGroup(
            inter6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inter6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(inter6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton21)
                    .addComponent(jButton28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton31, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        inter6Layout.setVerticalGroup(
            inter6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inter6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton28)
                .addGap(18, 18, 18)
                .addComponent(jButton31)
                .addGap(47, 47, 47)
                .addComponent(jButton21)
                .addGap(25, 25, 25))
            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout gerenciarSubEventoLayout = new javax.swing.GroupLayout(gerenciarSubEvento);
        gerenciarSubEvento.setLayout(gerenciarSubEventoLayout);
        gerenciarSubEventoLayout.setHorizontalGroup(
            gerenciarSubEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inter6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        gerenciarSubEventoLayout.setVerticalGroup(
            gerenciarSubEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inter6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPrincipal.add(gerenciarSubEvento, "gerenciarSubEvento");

        inter9.setBackground(new java.awt.Color(110, 139, 152));

        selecaoDadosInst4.setBackground(new java.awt.Color(255, 255, 255));
        selecaoDadosInst4.setPreferredSize(new java.awt.Dimension(585, 440));

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setForeground(new java.awt.Color(28, 73, 92));
        jLabel25.setText("Nome do sub-evento");

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setForeground(new java.awt.Color(28, 73, 92));
        jLabel26.setText("Vagas");

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setForeground(new java.awt.Color(28, 73, 92));
        jLabel27.setText("Local");

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setForeground(new java.awt.Color(28, 73, 92));
        jLabel28.setText("Nome do palestrante completo");

        jLabel29.setBackground(new java.awt.Color(255, 255, 255));
        jLabel29.setForeground(new java.awt.Color(28, 73, 92));
        jLabel29.setText("Telefone");

        jLabel30.setBackground(new java.awt.Color(255, 255, 255));
        jLabel30.setForeground(new java.awt.Color(28, 73, 92));
        jLabel30.setText("E-mail");

        botCancCadAdm4.setBackground(new java.awt.Color(201, 90, 65));
        botCancCadAdm4.setForeground(new java.awt.Color(255, 255, 255));
        botCancCadAdm4.setText("Cancelar");
        botCancCadAdm4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botCancCadAdm4ActionPerformed(evt);
            }
        });

        botConfCadIns4.setBackground(new java.awt.Color(28, 73, 92));
        botConfCadIns4.setForeground(new java.awt.Color(255, 255, 255));
        botConfCadIns4.setText("Confirmar");
        botConfCadIns4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botConfCadIns4ActionPerformed(evt);
            }
        });

        espacoTxtNomeSubEvento.setBackground(new java.awt.Color(255, 255, 255));

        espacoTxtEnderecoSubEvento.setBackground(new java.awt.Color(255, 255, 255));

        espacoTxtNomePalSubEvento.setBackground(new java.awt.Color(255, 255, 255));

        jLabel31.setBackground(new java.awt.Color(255, 255, 255));
        jLabel31.setForeground(new java.awt.Color(28, 73, 92));
        jLabel31.setText("Data");

        espacoTxtDataSubEvento.setBackground(new java.awt.Color(255, 255, 255));
        try {
            espacoTxtDataSubEvento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        espacoTxtHInicioSubEvento.setBackground(new java.awt.Color(255, 255, 255));
        try {
            espacoTxtHInicioSubEvento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        espacoTxtHFimSubEvento.setBackground(new java.awt.Color(255, 255, 255));
        try {
            espacoTxtHFimSubEvento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel32.setBackground(new java.awt.Color(255, 255, 255));
        jLabel32.setForeground(new java.awt.Color(28, 73, 92));
        jLabel32.setText("Horário inicio");

        jLabel33.setBackground(new java.awt.Color(255, 255, 255));
        jLabel33.setForeground(new java.awt.Color(28, 73, 92));
        jLabel33.setText("Horário término");

        espacoTxtVagasSubEvento.setBackground(new java.awt.Color(255, 255, 255));

        jLabel35.setBackground(new java.awt.Color(255, 255, 255));
        jLabel35.setForeground(new java.awt.Color(28, 73, 92));
        jLabel35.setText("Carga horária");

        espacoTxtCargaHSubEvento.setBackground(new java.awt.Color(255, 255, 255));

        espacoTxtTelefoneSubEvento.setBackground(new java.awt.Color(255, 255, 255));
        try {
            espacoTxtTelefoneSubEvento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ##### - ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        espacoTxtEmailPalSubEvento.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout selecaoDadosInst4Layout = new javax.swing.GroupLayout(selecaoDadosInst4);
        selecaoDadosInst4.setLayout(selecaoDadosInst4Layout);
        selecaoDadosInst4Layout.setHorizontalGroup(
            selecaoDadosInst4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selecaoDadosInst4Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(selecaoDadosInst4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(selecaoDadosInst4Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addGap(486, 486, 486))
                    .addGroup(selecaoDadosInst4Layout.createSequentialGroup()
                        .addGroup(selecaoDadosInst4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(selecaoDadosInst4Layout.createSequentialGroup()
                                .addComponent(espacoTxtTelefoneSubEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(espacoTxtEmailPalSubEvento))
                            .addComponent(espacoTxtEnderecoSubEvento, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(espacoTxtNomePalSubEvento, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(selecaoDadosInst4Layout.createSequentialGroup()
                                .addGroup(selecaoDadosInst4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addGroup(selecaoDadosInst4Layout.createSequentialGroup()
                                        .addComponent(jLabel29)
                                        .addGap(99, 99, 99)
                                        .addComponent(jLabel30))
                                    .addComponent(botCancCadAdm4, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botConfCadIns4, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(selecaoDadosInst4Layout.createSequentialGroup()
                                .addGroup(selecaoDadosInst4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(espacoTxtCargaHSubEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel35))
                                .addGap(18, 18, 18)
                                .addGroup(selecaoDadosInst4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(espacoTxtVagasSubEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26))
                                .addGap(18, 18, 18)
                                .addGroup(selecaoDadosInst4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selecaoDadosInst4Layout.createSequentialGroup()
                                        .addGroup(selecaoDadosInst4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(espacoTxtDataSubEvento)
                                            .addGroup(selecaoDadosInst4Layout.createSequentialGroup()
                                                .addComponent(jLabel31)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(selecaoDadosInst4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(espacoTxtHInicioSubEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel32))
                                        .addGap(18, 18, 18)
                                        .addGroup(selecaoDadosInst4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel33)
                                            .addComponent(espacoTxtHFimSubEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, selecaoDadosInst4Layout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(espacoTxtNomeSubEvento))
                        .addGap(78, 78, 78))))
        );
        selecaoDadosInst4Layout.setVerticalGroup(
            selecaoDadosInst4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selecaoDadosInst4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(espacoTxtNomeSubEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(selecaoDadosInst4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(selecaoDadosInst4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(espacoTxtDataSubEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(espacoTxtHInicioSubEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(espacoTxtHFimSubEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(espacoTxtVagasSubEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(espacoTxtCargaHSubEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(espacoTxtEnderecoSubEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(espacoTxtNomePalSubEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(selecaoDadosInst4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(selecaoDadosInst4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(espacoTxtTelefoneSubEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(espacoTxtEmailPalSubEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(selecaoDadosInst4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botCancCadAdm4)
                    .addComponent(botConfCadIns4))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout inter9Layout = new javax.swing.GroupLayout(inter9);
        inter9.setLayout(inter9Layout);
        inter9Layout.setHorizontalGroup(
            inter9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inter9Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(selecaoDadosInst4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        inter9Layout.setVerticalGroup(
            inter9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inter9Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(selecaoDadosInst4, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout addSubEventoSistemaLayout = new javax.swing.GroupLayout(addSubEventoSistema);
        addSubEventoSistema.setLayout(addSubEventoSistemaLayout);
        addSubEventoSistemaLayout.setHorizontalGroup(
            addSubEventoSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inter9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        addSubEventoSistemaLayout.setVerticalGroup(
            addSubEventoSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inter9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPrincipal.add(addSubEventoSistema, "addSubEventoSistema");

        inter11.setBackground(new java.awt.Color(110, 139, 152));

        selecaoDadosInst7.setBackground(new java.awt.Color(255, 255, 255));
        selecaoDadosInst7.setPreferredSize(new java.awt.Dimension(585, 440));

        jLabel49.setBackground(new java.awt.Color(255, 255, 255));
        jLabel49.setForeground(new java.awt.Color(28, 73, 92));
        jLabel49.setText("Nome do sub-evento");

        jLabel50.setBackground(new java.awt.Color(255, 255, 255));
        jLabel50.setForeground(new java.awt.Color(28, 73, 92));
        jLabel50.setText("Vagas");

        jLabel51.setBackground(new java.awt.Color(255, 255, 255));
        jLabel51.setForeground(new java.awt.Color(28, 73, 92));
        jLabel51.setText("Local");

        jLabel52.setBackground(new java.awt.Color(255, 255, 255));
        jLabel52.setForeground(new java.awt.Color(28, 73, 92));
        jLabel52.setText("Nome completo");

        jLabel53.setBackground(new java.awt.Color(255, 255, 255));
        jLabel53.setForeground(new java.awt.Color(28, 73, 92));
        jLabel53.setText("Telefone");

        jLabel54.setBackground(new java.awt.Color(255, 255, 255));
        jLabel54.setForeground(new java.awt.Color(28, 73, 92));
        jLabel54.setText("E-mail");

        botCancCadAdm7.setBackground(new java.awt.Color(201, 90, 65));
        botCancCadAdm7.setForeground(new java.awt.Color(255, 255, 255));
        botCancCadAdm7.setText("Cancelar");
        botCancCadAdm7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botCancCadAdm7ActionPerformed(evt);
            }
        });

        botConfCadIns7.setBackground(new java.awt.Color(28, 73, 92));
        botConfCadIns7.setForeground(new java.awt.Color(255, 255, 255));
        botConfCadIns7.setText("Confirmar");
        botConfCadIns7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botConfCadIns7ActionPerformed(evt);
            }
        });

        recebeTxtNomeSubEvento.setBackground(new java.awt.Color(255, 255, 255));

        recebeTxtEnderecoSubEvento.setBackground(new java.awt.Color(255, 255, 255));

        espTxtConfEmailInst5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel55.setBackground(new java.awt.Color(255, 255, 255));
        jLabel55.setForeground(new java.awt.Color(28, 73, 92));
        jLabel55.setText("Data");

        recebeTxtDataSubEvento.setBackground(new java.awt.Color(255, 255, 255));
        try {
            recebeTxtDataSubEvento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        recebeTxtHoraInicioSubEvento.setBackground(new java.awt.Color(255, 255, 255));
        try {
            recebeTxtHoraInicioSubEvento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        recebeTxtHoraFimSubEvento.setBackground(new java.awt.Color(255, 255, 255));
        try {
            recebeTxtHoraFimSubEvento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel56.setBackground(new java.awt.Color(255, 255, 255));
        jLabel56.setForeground(new java.awt.Color(28, 73, 92));
        jLabel56.setText("Horário inicio");

        jLabel57.setBackground(new java.awt.Color(255, 255, 255));
        jLabel57.setForeground(new java.awt.Color(28, 73, 92));
        jLabel57.setText("Horário término");

        recebeTxtVagasSubEvento.setBackground(new java.awt.Color(255, 255, 255));

        jLabel59.setBackground(new java.awt.Color(255, 255, 255));
        jLabel59.setForeground(new java.awt.Color(28, 73, 92));
        jLabel59.setText("Carga horária");

        recebeTxtCargaHSubEvento.setBackground(new java.awt.Color(255, 255, 255));

        jFormattedTextField20.setBackground(new java.awt.Color(255, 255, 255));
        try {
            jFormattedTextField20.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ##### - ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jTextField8.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout selecaoDadosInst7Layout = new javax.swing.GroupLayout(selecaoDadosInst7);
        selecaoDadosInst7.setLayout(selecaoDadosInst7Layout);
        selecaoDadosInst7Layout.setHorizontalGroup(
            selecaoDadosInst7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selecaoDadosInst7Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(selecaoDadosInst7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(selecaoDadosInst7Layout.createSequentialGroup()
                        .addComponent(jLabel51)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(selecaoDadosInst7Layout.createSequentialGroup()
                        .addGroup(selecaoDadosInst7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(selecaoDadosInst7Layout.createSequentialGroup()
                                .addComponent(jFormattedTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(jTextField8))
                            .addComponent(recebeTxtEnderecoSubEvento, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(espTxtConfEmailInst5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(selecaoDadosInst7Layout.createSequentialGroup()
                                .addGroup(selecaoDadosInst7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel49)
                                    .addGroup(selecaoDadosInst7Layout.createSequentialGroup()
                                        .addComponent(jLabel53)
                                        .addGap(99, 99, 99)
                                        .addComponent(jLabel54))
                                    .addComponent(botCancCadAdm7, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botConfCadIns7, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(selecaoDadosInst7Layout.createSequentialGroup()
                                .addGroup(selecaoDadosInst7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(recebeTxtCargaHSubEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel59))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addGroup(selecaoDadosInst7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(recebeTxtVagasSubEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel50))
                                .addGap(28, 28, 28)
                                .addGroup(selecaoDadosInst7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel58, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selecaoDadosInst7Layout.createSequentialGroup()
                                        .addGroup(selecaoDadosInst7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(recebeTxtDataSubEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel55))
                                        .addGap(18, 18, 18)
                                        .addGroup(selecaoDadosInst7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(recebeTxtHoraInicioSubEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel56))
                                        .addGap(18, 18, 18)
                                        .addGroup(selecaoDadosInst7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel57)
                                            .addComponent(recebeTxtHoraFimSubEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, selecaoDadosInst7Layout.createSequentialGroup()
                                .addComponent(jLabel52)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(recebeTxtNomeSubEvento))
                        .addGap(74, 74, 74))))
        );
        selecaoDadosInst7Layout.setVerticalGroup(
            selecaoDadosInst7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selecaoDadosInst7Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(recebeTxtNomeSubEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(selecaoDadosInst7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(jLabel55)
                    .addComponent(jLabel56)
                    .addComponent(jLabel57)
                    .addComponent(jLabel59))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(selecaoDadosInst7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(recebeTxtDataSubEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(recebeTxtHoraInicioSubEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(recebeTxtHoraFimSubEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(recebeTxtVagasSubEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(recebeTxtCargaHSubEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(recebeTxtEnderecoSubEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(espTxtConfEmailInst5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(selecaoDadosInst7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(jLabel54))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(selecaoDadosInst7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(selecaoDadosInst7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botCancCadAdm7)
                    .addComponent(botConfCadIns7))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout inter11Layout = new javax.swing.GroupLayout(inter11);
        inter11.setLayout(inter11Layout);
        inter11Layout.setHorizontalGroup(
            inter11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inter11Layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(selecaoDadosInst7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        inter11Layout.setVerticalGroup(
            inter11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inter11Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(selecaoDadosInst7, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout editarSubEventoAdmLayout = new javax.swing.GroupLayout(editarSubEventoAdm);
        editarSubEventoAdm.setLayout(editarSubEventoAdmLayout);
        editarSubEventoAdmLayout.setHorizontalGroup(
            editarSubEventoAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inter11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        editarSubEventoAdmLayout.setVerticalGroup(
            editarSubEventoAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inter11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPrincipal.add(editarSubEventoAdm, "editarSubEventoAdm");

        visSubEvento.setBackground(new java.awt.Color(110, 139, 152));

        botVoltarGerenciarSubEventoAdm.setBackground(new java.awt.Color(201, 90, 65));
        botVoltarGerenciarSubEventoAdm.setForeground(new java.awt.Color(255, 255, 255));
        botVoltarGerenciarSubEventoAdm.setText("Voltar");
        botVoltarGerenciarSubEventoAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botVoltarGerenciarSubEventoAdmActionPerformed(evt);
            }
        });

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jLabel65.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(28, 73, 92));
        jLabel65.setText("Informações sobre o evento");

        recebeNomeSubEventoInf.setForeground(new java.awt.Color(68, 108, 125));
        recebeNomeSubEventoInf.setText("NomeSub");

        recebeEnderecoSubEventoInf.setForeground(new java.awt.Color(68, 108, 125));
        recebeEnderecoSubEventoInf.setText("EnderecoSu");

        recebeDataInicioSubEventoInf.setForeground(new java.awt.Color(68, 108, 125));
        recebeDataInicioSubEventoInf.setText("DataInici");

        recebeHoraInicioSubEventoInf.setForeground(new java.awt.Color(68, 108, 125));
        recebeHoraInicioSubEventoInf.setText("HoraIn");

        recebeHoraFimSubEventoInf.setForeground(new java.awt.Color(68, 108, 125));
        recebeHoraFimSubEventoInf.setText("HoraFim");

        recebeVagasSubEventoInf.setForeground(new java.awt.Color(68, 108, 125));
        recebeVagasSubEventoInf.setText("VagasS");

        recebeCargaHSubEventoInf.setForeground(new java.awt.Color(68, 108, 125));
        recebeCargaHSubEventoInf.setText("CargaHSu");

        recebeCargaHSubEventoInf2.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        recebeCargaHSubEventoInf2.setForeground(new java.awt.Color(28, 73, 92));
        recebeCargaHSubEventoInf2.setText("Informações palestrante");

        recebeNomePalestrante.setForeground(new java.awt.Color(68, 108, 125));
        recebeNomePalestrante.setText("Nome");

        recebeEmailPalestrante.setForeground(new java.awt.Color(68, 108, 125));
        recebeEmailPalestrante.setText("Email");

        recebeTelefonelPalestrante.setForeground(new java.awt.Color(68, 108, 125));
        recebeTelefonelPalestrante.setText("telefone");

        jLabel102.setForeground(new java.awt.Color(28, 73, 92));
        jLabel102.setText("Nome do palestrante:");

        jLabel103.setForeground(new java.awt.Color(28, 73, 92));
        jLabel103.setText("Telefone:");

        jLabel104.setForeground(new java.awt.Color(28, 73, 92));
        jLabel104.setText("E-mail:");

        jLabel108.setForeground(new java.awt.Color(28, 73, 92));
        jLabel108.setText("Carga horária:");

        jLabel107.setForeground(new java.awt.Color(28, 73, 92));
        jLabel107.setText("Horário de inicio:");

        jLabel110.setForeground(new java.awt.Color(28, 73, 92));
        jLabel110.setText("Horário de término:");

        jLabel111.setForeground(new java.awt.Color(28, 73, 92));
        jLabel111.setText("Vagas disponíveis:");

        jLabel106.setForeground(new java.awt.Color(28, 73, 92));
        jLabel106.setText("Data:");

        jLabel109.setForeground(new java.awt.Color(28, 73, 92));
        jLabel109.setText("Endereço:");

        jLabel105.setForeground(new java.awt.Color(28, 73, 92));
        jLabel105.setText("Nome do evento:");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel12Layout.createSequentialGroup()
                                        .addComponent(jLabel107)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(recebeHoraInicioSubEventoInf))
                                    .addGroup(jPanel12Layout.createSequentialGroup()
                                        .addComponent(jLabel108)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(recebeCargaHSubEventoInf)))
                                .addGap(114, 114, 114)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel12Layout.createSequentialGroup()
                                        .addComponent(jLabel111)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(recebeVagasSubEventoInf))
                                    .addGroup(jPanel12Layout.createSequentialGroup()
                                        .addComponent(jLabel110)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(recebeHoraFimSubEventoInf))))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel109)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(recebeEnderecoSubEventoInf))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel105)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(recebeNomeSubEventoInf))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel106)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(recebeDataInicioSubEventoInf)))
                        .addContainerGap(95, Short.MAX_VALUE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(recebeCargaHSubEventoInf2)
                            .addComponent(jLabel65)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel103)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(recebeTelefonelPalestrante))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel102)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(recebeNomePalestrante))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel104)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(recebeEmailPalestrante)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel65)
                .addGap(33, 33, 33)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel105)
                    .addComponent(recebeNomeSubEventoInf))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel106)
                    .addComponent(recebeDataInicioSubEventoInf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel107)
                    .addComponent(jLabel110)
                    .addComponent(recebeHoraInicioSubEventoInf)
                    .addComponent(recebeHoraFimSubEventoInf))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel108)
                    .addComponent(jLabel111)
                    .addComponent(recebeVagasSubEventoInf)
                    .addComponent(recebeCargaHSubEventoInf))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel109)
                    .addComponent(recebeEnderecoSubEventoInf))
                .addGap(66, 66, 66)
                .addComponent(recebeCargaHSubEventoInf2)
                .addGap(29, 29, 29)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel102)
                    .addComponent(recebeNomePalestrante))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel103)
                    .addComponent(recebeTelefonelPalestrante))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel104)
                    .addComponent(recebeEmailPalestrante))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout visSubEventoLayout = new javax.swing.GroupLayout(visSubEvento);
        visSubEvento.setLayout(visSubEventoLayout);
        visSubEventoLayout.setHorizontalGroup(
            visSubEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(visSubEventoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(botVoltarGerenciarSubEventoAdm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        visSubEventoLayout.setVerticalGroup(
            visSubEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, visSubEventoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botVoltarGerenciarSubEventoAdm)
                .addGap(19, 19, 19))
        );

        jPrincipal.add(visSubEvento, "visSubEventoAdm");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void jBotLoginAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotLoginAdmActionPerformed
        espacoTxtEmail.setText("");
        espacoTxtSenha.setText("");
        CardLayout c1 = (CardLayout) jPrincipal.getLayout();
        c1.show(jPrincipal, "LoginAdm");
    }//GEN-LAST:event_jBotLoginAdmActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        EspacoTxtEmaiAluno.setText("");
        TxtSenhaLoginAluno.setText("");
        CardLayout c1 = (CardLayout) jPrincipal.getLayout();
        c1.show(jPrincipal, "LoginAluno");     
    }//GEN-LAST:event_jButton1ActionPerformed
    private void botEntrarAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botEntrarAdmActionPerformed
        MenuInicial menu = new MenuInicial();
        String senha = new String( espacoTxtSenha.getPassword());
    	adm = menu.loginADM(espacoTxtEmail.getText(), senha);
        
        try{
            if(espacoTxtEmail.getText().equals(adm.getEmail()) && senha.equals(adm.getSenha()) && adm != null){
            CardLayout c1 = (CardLayout) jPrincipal.getLayout();
            c1.show(jPrincipal, "perfilAdm");
        }
        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(null, "E-mail/Senha inválido!");
        }
    }//GEN-LAST:event_botEntrarAdmActionPerformed
     
    private void botMudarLoginAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botMudarLoginAlunoActionPerformed
        EspacoTxtEmaiAluno.setText("");
        TxtSenhaLoginAluno.setText("");
        CardLayout c1 = (CardLayout) jPrincipal.getLayout();
        c1.show(jPrincipal, "LoginAluno");
    }//GEN-LAST:event_botMudarLoginAlunoActionPerformed
  
    private void botEntrarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botEntrarAlunoActionPerformed
        FindAluno alu = new FindAluno();
        String senha = new String(TxtSenhaLoginAluno.getPassword());
	aluno = alu.Login(EspacoTxtEmaiAluno.getText(), senha);
        try{
            if(EspacoTxtEmaiAluno.getText().equals(aluno.getEmail()) && senha.equals(aluno.getSenha())){
            CardLayout c1 = (CardLayout) jPrincipal.getLayout();
            c1.show(jPrincipal, "perfilAluno");
        }
        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(null, "E-mail/Senha inválido!");
        }
    }//GEN-LAST:event_botEntrarAlunoActionPerformed

    private void botMudarLoginAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botMudarLoginAdmActionPerformed
        espacoTxtEmail.setText("");
        espacoTxtSenha.setText("");
        CardLayout c1 = (CardLayout) jPrincipal.getLayout();
        c1.show(jPrincipal, "LoginAdm");
    }//GEN-LAST:event_botMudarLoginAdmActionPerformed

    private void botCadastraAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCadastraAdmActionPerformed
        espacoTxtNomeIns.setText("");
        txtCnpj.setText("");
        espacoTxtEmailCadInst.setText("");
        espTxtConfEmailInst.setText("");
        jPasswordField1.setText("");
        jPasswordField2.setText("");
        CardLayout c1 = (CardLayout) jPrincipal.getLayout();
        c1.show(jPrincipal, "cadastroAdm");
    }//GEN-LAST:event_botCadastraAdmActionPerformed

    private void botConfCadInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botConfCadInsActionPerformed
        String senha = new String( jPasswordField1.getPassword());
        String confSenha = new String( jPasswordField2.getPassword());
        if(espacoTxtNomeIns.getText().equals("") || txtCnpj.getText().equals("") || 
        		espacoTxtEmailCadInst.getText().equals("") || espTxtConfEmailInst.getText().equals("") || 
        		senha.equals("") || confSenha.equals("")){
            JOptionPane.showMessageDialog(null, "Campo nÃ£o informado!");
        }
        else{
        	if(!espacoTxtEmailCadInst.getText().equals(espTxtConfEmailInst.getText())){
        		JOptionPane.showMessageDialog(null, "Os e-mails devem ser iguais!");
        	}else {
        		if(!senha.equals(confSenha)) {
        			JOptionPane.showMessageDialog(null, "As senhasn devem ser iguais!");
        		}else {
        			Criar_admin ad = new Criar_admin(txtCnpj.getText(),senha,espacoTxtNomeIns.getText(),espTxtConfEmailInst.getText());
                                CardLayout c1 = (CardLayout) jPrincipal.getLayout();
                                c1.show(jPrincipal, "LoginAdm");
                                espacoTxtEmail.setText("");
                                espacoTxtSenha.setText("");
        		}
        	}
        }
    }//GEN-LAST:event_botConfCadInsActionPerformed

    private void botCancCadAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCancCadAdmActionPerformed
        espacoTxtEmail.setText(" ");
        espacoTxtSenha.setText(" ");
        CardLayout c1 = (CardLayout) jPrincipal.getLayout();
        c1.show(jPrincipal, "LoginAdm");
    }//GEN-LAST:event_botCancCadAdmActionPerformed

    private void botCancCadAdm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCancCadAdm1ActionPerformed
        CardLayout c1 = (CardLayout) jPrincipal.getLayout();
        c1.show(jPrincipal, "gerenciarContaAdm");
    }//GEN-LAST:event_botCancCadAdm1ActionPerformed

    private void botConfCadIns1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botConfCadIns1ActionPerformed
        String senha = new String(senhaEditarIns.getPassword());
        String confSenha = new String(confirmarSenhaEditarIns.getPassword());
        
        if(espacoTxtEditarNomeIns.getText().equals("") || 
        		espacoTxtEditarEmailCadInst.getText().equals("") || 
                        espTxtEditarConfEmailInst.getText().equals("") || 
        		senha.equals("") || confSenha.equals("")){
            JOptionPane.showMessageDialog(null, "Campo nÃ£o informado!");
        }
        else{
        	if(!espacoTxtEmailCadInst.getText().equals(espTxtConfEmailInst.getText())){
        		JOptionPane.showMessageDialog(null, "Os e-mails devem ser iguais!");
        	}else {
        		if(!senha.equals(confSenha)) {
        			JOptionPane.showMessageDialog(null, "As senhasn devem ser iguais!");
        		}else {
                                Editar_admin ed1 = new Editar_admin(adm.getId_admin());
                                ed1.EditarEmail(espTxtEditarConfEmailInst.getText());
                                ed1.EditarSenha(senha);
                                ed1.EditarNome(espacoTxtEditarNomeIns.getText());
                                CardLayout c1 = (CardLayout) jPrincipal.getLayout();
                                c1.show(jPrincipal, "LoginAdm");
        		}
        	}
        }        
    }//GEN-LAST:event_botConfCadIns1ActionPerformed

    private void botCancCadAdm2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCancCadAdm2ActionPerformed
        CardLayout c1 = (CardLayout) jPrincipal.getLayout();
        c1.show(jPrincipal, "gerenciarAlunoAdm");
    }//GEN-LAST:event_botCancCadAdm2ActionPerformed
    private void listaAlunoSistema (){
        ArrayList<Aluno> list = new ArrayList();
        FindAluno aluno = new FindAluno();
        list = aluno.findAll();
        DefaultListModel DML = new DefaultListModel();
        
        for (int i = 0; i < list.size(); i++) {
            DML.addElement("Id(" + list.get(i).getId_aluno() + ")  " + list.get(i).getNome());
        }
        
        listaAlunosPAdm.setModel(DML);
    }
    private void botConfCadIns2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botConfCadIns2ActionPerformed
            if(espacoTxtNomeAlunoPAdm.getText().equals("") || espacoTxtCpfAlunoPAdm.getText().equals("") || espacoTxtEmailAlunoPAdm.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Campo não informado!");
            }
            else{
                
                Criar_aluno alu = new Criar_aluno(espacoTxtCpfAlunoPAdm.getText(), espacoTxtNomeAlunoPAdm.getText(), espacoTxtEmailAlunoPAdm.getText());
                /*GeradorId idGrAluno = new GeradorId();
                EmailSenha senha = new EmailSenha(idGrAluno.id_aluno()-1);*/
                
                listaAlunoSistema ();
                                                
                CardLayout c1 = (CardLayout) jPrincipal.getLayout();
                c1.show(jPrincipal, "gerenciarAlunoAdm");
            }
            

    }//GEN-LAST:event_botConfCadIns2ActionPerformed

    private void botCancCadAdm3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCancCadAdm3ActionPerformed
        CardLayout c1 = (CardLayout) jPrincipal.getLayout();
        c1.show(jPrincipal, "gerenciarEventoAdm");
    }//GEN-LAST:event_botCancCadAdm3ActionPerformed

    private void botConfCadIns3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botConfCadIns3ActionPerformed
         
        if(espacoTxtNomeEvento.getText().equals("") || 
                dataEventoinicio.getText().equals("") || 
                dataEventoFim.getText().equals("") ||
                HorInicioEvento.getText().equals("") ||
                HorFiimEvento.getText().equals("") ||
                espacoTxtEnderecoEventoInst.getText().equals("") ||
                espTxtAreaEnsinoEvento.getText().equals("") ||
                espTxtCargaHEvento.getText().equals("") || 
                espTxtVagasEvento.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Campo não informado!");
            }
            else{
                
                Criar_evento ev = new Criar_evento(espacoTxtNomeEvento.getText(), espacoTxtEnderecoEventoInst.getText(), 
                dataEventoinicio.getText(), dataEventoFim.getText(), HorInicioEvento.getText(),
                HorFiimEvento.getText(), espTxtAreaEnsinoEvento.getText(),  espTxtCargaHEvento.getText(),
                espTxtVagasEvento.getText());
        
                listaEventoSistema ();
                                                
                CardLayout c1 = (CardLayout) jPrincipal.getLayout();
                c1.show(jPrincipal, "gerenciarEventoAdm");
            }
    }//GEN-LAST:event_botConfCadIns3ActionPerformed

    private void botCancCadAdm4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCancCadAdm4ActionPerformed
        CardLayout c1 = (CardLayout) jPrincipal.getLayout();
        c1.show(jPrincipal, "visEventoAdm");
    }//GEN-LAST:event_botCancCadAdm4ActionPerformed
    
    private void listaSubEventoSistema (){
        
         int index = listaEventosPAdm.getSelectedIndex();
                        
            ArrayList<Evento> list = new ArrayList();
            FindEvento evento = new FindEvento();
            list = evento.findAll();
        
        ArrayList<Subevento> listSub = new ArrayList();
        FindSubevento subEvento = new FindSubevento();
        listSub = subEvento.findAll(list.get(index).getId_evento());
        DefaultListModel DML = new DefaultListModel();
        
        for (int i = 0; i < listSub.size(); i++) {
            DML.addElement("Id(" + listSub.get(i).getId_subevento() + ") " + listSub.get(i).getNomesubevento());
        }
        
        listaSubEventosPAdm.setModel(DML);
        listaSubEventosPAluno.setModel(DML);
    }
    
    private void botConfCadIns4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botConfCadIns4ActionPerformed
         
        int index = listaEventosPAdm.getSelectedIndex();
                        
            ArrayList<Evento> list = new ArrayList();
            FindEvento evento = new FindEvento();
            list = evento.findAll();
            
        if(espacoTxtNomeSubEvento.getText().equals("") || 
                espacoTxtCargaHSubEvento.getText().equals("") || 
                espacoTxtVagasSubEvento.getText().equals("") ||
                espacoTxtDataSubEvento.getText().equals("") ||
                espacoTxtHInicioSubEvento.getText().equals("") ||
                espacoTxtHFimSubEvento.getText().equals("") ||
                espacoTxtEnderecoSubEvento.getText().equals("") || 
                espacoTxtNomePalSubEvento.getText().equals("") ||
                espacoTxtTelefoneSubEvento.getText().equals("") ||
                espacoTxtEmailPalSubEvento.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Campo não informado!");
            }
            else{
                
                Criar_subevento sub = new Criar_subevento(list.get(index).getId_evento(),
                espacoTxtCargaHSubEvento.getText(),
                espacoTxtNomeSubEvento.getText(),
                espacoTxtEnderecoSubEvento.getText(),
                espacoTxtHInicioSubEvento.getText(),
                espacoTxtHFimSubEvento.getText(),
                espacoTxtDataSubEvento.getText(),
                espacoTxtVagasSubEvento.getText());
        
                listaSubEventoSistema ();
                GeradorId grPales = new GeradorId();
                
                Criar_palestrante pale = new Criar_palestrante(grPales.id_subevento()-1, espacoTxtNomePalSubEvento.getText(), espacoTxtEmailPalSubEvento.getText(), espacoTxtTelefoneSubEvento.getText());
                
                Criar_gerenciaPalestrante gp = new Criar_gerenciaPalestrante(grPales.id_subevento()-1 ,grPales.id_palestrante()-1);
                
                CardLayout c1 = (CardLayout) jPrincipal.getLayout();
                c1.show(jPrincipal, "gerenciarSubEvento");
            }
    }//GEN-LAST:event_botConfCadIns4ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        JavaMailApp email = new JavaMailApp (even.getId_evento());
    }//GEN-LAST:event_jButton30ActionPerformed

    private void botCancCadAdm5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCancCadAdm5ActionPerformed
        CardLayout c1 = (CardLayout) jPrincipal.getLayout();
        c1.show(jPrincipal, "perfilAluno");
    }//GEN-LAST:event_botCancCadAdm5ActionPerformed

    private void botConfCadIns5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botConfCadIns5ActionPerformed
        String senhaAtual = new String(ConfSenhaAtualAluno.getPassword());
        String senha = new String(novaSenhaAluno.getPassword());
        String confSenha = new String(confNovaSenhaAluno.getPassword());
        
        if(senhaAtual.equals("") || 
        	senha.equals("") || 
        	confSenha.equals("")){
            JOptionPane.showMessageDialog(null, "Campo não informado!");
        }
        else{
        	if(!senhaAtual.equals(aluno.getSenha())){
        		JOptionPane.showMessageDialog(null, "Digite a senha atual");
        	}else {
        		if(!senha.equals(confSenha)) {
        			JOptionPane.showMessageDialog(null, "As senhasn devem ser iguais!");
        		}else {
                                Editar_aluno ed2 = new Editar_aluno(aluno.getId_aluno());//necessario passar o id_aluno
                                ed2.EditarSenha(senha);
                                ed2.EditarEmail(espacoTxtEmailAluno.getText());
                                ed2.EditarNome(espacoTxtNomeAluno.getText());
                            
                                CardLayout c1 = (CardLayout) jPrincipal.getLayout();
                                c1.show(jPrincipal, "LoginAluno");
        		}
        	}
        }   
    }//GEN-LAST:event_botConfCadIns5ActionPerformed

    private void botCancCadAdm6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCancCadAdm6ActionPerformed
        CardLayout c1 = (CardLayout) jPrincipal.getLayout();
        c1.show(jPrincipal, "visEventoAdm");
    }//GEN-LAST:event_botCancCadAdm6ActionPerformed

    private void botConfCadIns6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botConfCadIns6ActionPerformed
        
        Editar_evento ev = new Editar_evento(even.getId_evento());//necessario passar p id_evento
	ev.EditarCargaHoraria(RecebeTxtCargaHEvento.getText());
	ev.EditarNome(RecebeTxtNomeEvento.getText());
	ev.EditarEndereco(RecebeTxtEnderecoEvento.getText());
	ev.EditarHoraInicio(RecebeTxtHoraInicioEvento.getText());
	ev.EditarHoraTermino(RecebeTxtHoraFEvento.getText());
	ev.EditarDataInicio(RecebeTxtDataInicioEvento.getText());
	ev.EditarDataTermino(RecebeTxtDataFimEvento.getText());
	ev.EditarArea(RecebeTxtAreaEvento.getText());
	ev.EditarVagas(RecebeTxtVagasEvento.getText());
        
        listaEventoSistema ();
        
        int index = listaEventosPAdm.getSelectedIndex();
                        
            ArrayList<Evento> list = new ArrayList();
            FindEvento evento = new FindEvento();
            list = evento.findAll();
            
        CardLayout c1 = (CardLayout) jPrincipal.getLayout();
        c1.show(jPrincipal, "gerenciarEventoAdm");
    }//GEN-LAST:event_botConfCadIns6ActionPerformed

    private void botCancCadAdm7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCancCadAdm7ActionPerformed
        CardLayout c1 = (CardLayout) jPrincipal.getLayout();
        c1.show(jPrincipal, "gerenciarSubEvento");

    }//GEN-LAST:event_botCancCadAdm7ActionPerformed

    private void botConfCadIns7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botConfCadIns7ActionPerformed
        
        Editar_subevento s = new Editar_subevento(subev.getId_subevento()); //necessario passar p id_subevento
	s.EditarCargaHoraria(recebeTxtCargaHSubEvento.getText());
	s.EditarEndereco(recebeTxtEnderecoSubEvento.getText());
	s.EditarHoraInicio(recebeTxtHoraInicioSubEvento.getText());
	s.EditarHoraTermino(recebeTxtHoraFimSubEvento.getText());
	s.EditarNome(recebeTxtNomeSubEvento.getText());
	s.EditarVagas(recebeTxtVagasSubEvento.getText());
	s.EditarData(recebeTxtDataSubEvento.getText());
        
        FindPalestrante fPalestrante = new FindPalestrante();
        Palestrante p1 = fPalestrante.findOne(subev.getId_subevento());  
        
        Editar_palestrante p = new Editar_palestrante(p1.getId_palestrante()); //necessario passar o id_palestrante
	p.EditarEmail(espTxtConfEmailInst5.getText());
	p.EditarNome(jTextField8.getText());
	p.EditarTelefone(jFormattedTextField20.getText());
        
        listaSubEventoSistema ();
                    
        CardLayout c1 = (CardLayout) jPrincipal.getLayout();
        c1.show(jPrincipal, "gerenciarSubEvento");
    }//GEN-LAST:event_botConfCadIns7ActionPerformed

    private void botVoltarGerenciarSubEventoAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botVoltarGerenciarSubEventoAdmActionPerformed
        CardLayout c1 = (CardLayout) jPrincipal.getLayout();
        c1.show(jPrincipal, "gerenciarSubEvento");
    }//GEN-LAST:event_botVoltarGerenciarSubEventoAdmActionPerformed

    private void botAddAlunoPAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botAddAlunoPAdmActionPerformed
        espacoTxtNomeAlunoPAdm.setText("");
        espacoTxtCpfAlunoPAdm.setText("");
        espacoTxtEmailAlunoPAdm.setText("");
        CardLayout c1 = (CardLayout) jPrincipal.getLayout();
        c1.show(jPrincipal, "addAlunoSistema");
    }//GEN-LAST:event_botAddAlunoPAdmActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                
        listaAlunoSistema ();
        
        CardLayout c1 = (CardLayout) jPrincipal.getLayout();
        c1.show(jPrincipal, "gerenciarAlunoAdm");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        CardLayout c1 = (CardLayout) jPrincipal.getLayout();
        c1.show(jPrincipal, "perfilAdm");
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        
        int index_1 = listaSubEventosPAdm.getSelectedIndex();

        ArrayList<Evento> list = new ArrayList();
        FindEvento evento = new FindEvento();
        list = evento.findAll();
        
        ArrayList<Subevento> listSub = new ArrayList();
        FindSubevento subEvento = new FindSubevento();
        listSub = subEvento.findAll(list.get(index_1).getId_evento());
        subev = listSub.get(index_1);
        
        CardLayout c1 = (CardLayout) jPrincipal.getLayout();
        c1.show(jPrincipal, "editarSubEventoAdm");
        
        recebeTxtNomeSubEvento.setText(subev.getNomesubevento());
        recebeTxtDataSubEvento.setText(subev.getDatasub());
        recebeTxtHoraInicioSubEvento.setText(subev.getHorainicio());
        recebeTxtHoraFimSubEvento.setToolTipText(subev.getHorafim());
        recebeTxtHoraFimSubEvento.setText(subev.getEndereco());
        recebeTxtVagasSubEvento.setText(subev.getVagas());
        recebeTxtCargaHSubEvento.setText(subev.getCargahoraria());
        recebeTxtEnderecoSubEvento.setText(subev.getEndereco());
        
        FindPalestrante fPalestrante = new FindPalestrante();
        Palestrante p3 = fPalestrante.findOne(subev.getId_subevento());
        
        espTxtConfEmailInst5.setText(p3.getNomecompleto());
        jFormattedTextField20.setText(p3.getTelefone());
        jTextField8.setText(p3.getEmail());        
    }//GEN-LAST:event_jButton31ActionPerformed

    private void listaAlunosPAdmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaAlunosPAdmMouseClicked
    }//GEN-LAST:event_listaAlunosPAdmMouseClicked

    private void botExcluirAlunoPAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botExcluirAlunoPAdmActionPerformed
        
            int index = listaAlunosPAdm.getSelectedIndex();
                        
            ArrayList<Aluno> list = new ArrayList();
            FindAluno aluno = new FindAluno();
            list = aluno.findAll();
            
            Delete_aluno al = new Delete_aluno(list.get(index).getId_aluno());
            
            listaAlunoSistema ();
    }//GEN-LAST:event_botExcluirAlunoPAdmActionPerformed

    private void espacoTxtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_espacoTxtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_espacoTxtSenhaActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        CardLayout c1 = (CardLayout) jPrincipal.getLayout();
        c1.show(jPrincipal, "editarDadosAdm");
        espacoTxtEditarNomeIns.setText(adm.getNome());
        recebeCnpjIns.setText(adm.getCpf());
        espacoTxtEditarEmailCadInst.setText(adm.getEmail());
        espTxtEditarConfEmailInst.setText(adm.getEmail());
        senhaEditarIns.setText(adm.getSenha());
        confirmarSenhaEditarIns.setText(adm.getSenha());
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        CardLayout c1 = (CardLayout) jPrincipal.getLayout();
        c1.show(jPrincipal, "perfilAdm");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        CardLayout c1 = (CardLayout) jPrincipal.getLayout();
        c1.show(jPrincipal, "gerenciarEventoAdm");
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        CardLayout c1 = (CardLayout) jPrincipal.getLayout();
        c1.show(jPrincipal, "gerenciarAlunoAdm");
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        CardLayout c1 = (CardLayout) jPrincipal.getLayout();
        c1.show(jPrincipal, "perfilAdm");
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        CardLayout c1 = (CardLayout) jPrincipal.getLayout();
        c1.show(jPrincipal, "Menu");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        CardLayout c1 = (CardLayout) jPrincipal.getLayout();
        c1.show(jPrincipal, "Menu");
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        CardLayout c1 = (CardLayout) jPrincipal.getLayout();
        c1.show(jPrincipal, "perfilAluno");
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        CardLayout c1 = (CardLayout) jPrincipal.getLayout();
        c1.show(jPrincipal, "eventoAluno");
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CardLayout c1 = (CardLayout) jPrincipal.getLayout();
        c1.show(jPrincipal, "gerenciarContaAdm");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Delete_admin d1 = new Delete_admin(adm.getId_admin());
        CardLayout c1 = (CardLayout) jPrincipal.getLayout();
        c1.show(jPrincipal, "Menu");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void listaEventosPAdmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaEventosPAdmMouseClicked
        
        
        
    }//GEN-LAST:event_listaEventosPAdmMouseClicked
    private void listaEventoSistema (){
        ArrayList<Evento> list = new ArrayList();
        FindEvento evento = new FindEvento();
        list = evento.findAll();
        DefaultListModel DML = new DefaultListModel();
        
        for (int i = 0; i < list.size(); i++) {
            DML.addElement("Id(" + list.get(i).getId_evento()+ ")     Nome: " + list.get(i).getNomeEvento());
        }
        
        listaEventosPAdm.setModel(DML);
        listaEventosPAluno.setModel(DML);
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
               
        listaEventoSistema ();
        
        CardLayout c1 = (CardLayout) jPrincipal.getLayout();
        c1.show(jPrincipal, "gerenciarEventoAdm");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        
        
        CardLayout c1 = (CardLayout) jPrincipal.getLayout();
        c1.show(jPrincipal, "addEventoSistema");
        
        
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        
            int index = listaEventosPAdm.getSelectedIndex();
                        
            ArrayList<Evento> list = new ArrayList();
            FindEvento evento = new FindEvento();
            list = evento.findAll();
            even = list.get(index);
            recebeNomeEventoInf.setText(list.get(index).getNomeEvento());
            recebeEnderecoEventoInf.setText(list.get(index).getEndereco());
            recebeDataInicioEventoInf.setText(list.get(index).getDataAbertura());
            recebeDataFimEventoInf.setText(list.get(index).getDataEncerra());
            recebeHoraInicioEventoInf.setText(list.get(index).getHoraInicio());
            recebeHoraFimEventoInf.setText(list.get(index).getHoraFim());
            recebeAreaEventoInf.setText(list.get(index).getArea());
            recebeVagasEventoInf.setText(list.get(index).getVagas());
            recebeCargaHEventoInf.setText(list.get(index).getCargaHoraria());
            
            CardLayout c1 = (CardLayout) jPrincipal.getLayout();
            c1.show(jPrincipal, "visEventoAdm");
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed
        listaSubEventoSistema ();
        CardLayout c1 = (CardLayout) jPrincipal.getLayout();
        c1.show(jPrincipal, "gerenciarSubEvento");
    }//GEN-LAST:event_jButton48ActionPerformed

    private void listaSubEventosPAdmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaSubEventosPAdmMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_listaSubEventosPAdmMouseClicked

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        int index = listaEventosPAdm.getSelectedIndex();
        
        ArrayList<Subevento> listSub = new ArrayList();
        FindSubevento subEvento = new FindSubevento();
        listSub = subEvento.findAll(even.getId_evento());
        DefaultListModel DML = new DefaultListModel();
            
            recebeNomeSubEventoInf.setText(listSub.get(index).getNomesubevento());
            recebeEnderecoSubEventoInf.setText(listSub.get(index).getEndereco());
            recebeDataInicioSubEventoInf.setText(listSub.get(index).getDatasub());
            recebeHoraInicioSubEventoInf.setText(listSub.get(index).getHorainicio());
            recebeHoraFimSubEventoInf.setText(listSub.get(index).getHorafim());
            recebeVagasSubEventoInf.setText(listSub.get(index).getVagas());
            recebeCargaHSubEventoInf.setText(listSub.get(index).getCargahoraria());
        
        FindPalestrante fP1 = new FindPalestrante();
        Palestrante p1 = fP1.findOne(listSub.get(index).getId_subevento());
        recebeNomePalestrante.setText(p1.getNomecompleto());
        recebeEmailPalestrante.setText(p1.getEmail());
        recebeTelefonelPalestrante.setText(p1.getTelefone());
           
            CardLayout c1 = (CardLayout) jPrincipal.getLayout();
            c1.show(jPrincipal, "visSubEventoAdm");
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        CardLayout c1 = (CardLayout) jPrincipal.getLayout();
        c1.show(jPrincipal, "visEventoAdm");
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        CardLayout c1 = (CardLayout) jPrincipal.getLayout();
        c1.show(jPrincipal, "editarAlunoSistema");
        espacoTxtNomeAluno.setText(aluno.getNome());
        espacoTxtCpfAluno.setText(aluno.getCpf());
        espacoTxtEmailAluno.setText(aluno.getEmail());
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        
        Delete_aluno d2 = new Delete_aluno(aluno.getId_aluno());
        CardLayout c1 = (CardLayout) jPrincipal.getLayout();
        c1.show(jPrincipal, "Menu");
    }//GEN-LAST:event_jButton37ActionPerformed

    private void listaEventosPAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaEventosPAlunoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_listaEventosPAlunoMouseClicked

    private void listaSubEventosPAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaSubEventosPAlunoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_listaSubEventosPAlunoMouseClicked

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        listaEventoSistema();
        CardLayout c1 = (CardLayout) jPrincipal.getLayout();
        c1.show(jPrincipal, "eventoAluno");
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed
        CardLayout c1 = (CardLayout) jPrincipal.getLayout();
        c1.show(jPrincipal, "subEventoAluno");
    }//GEN-LAST:event_jButton47ActionPerformed

    private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton49ActionPerformed
        int index = listaEventosPAluno.getSelectedIndex();
                        
            ArrayList<Evento> list = new ArrayList();
            FindEvento evento = new FindEvento();
            list = evento.findAll();
            even = list.get(index);
            recebeNomeEventoPAluno.setText(list.get(index).getNomeEvento());
            recebeEnderecoEventoPAluno.setText(list.get(index).getEndereco());
            recebeDataInicioEventoPAluno.setText(list.get(index).getDataAbertura());
            recebeDataFimEventoPAluno.setText(list.get(index).getDataEncerra());
            recebeHoraInicioEventoPAluno.setText(list.get(index).getHoraInicio());
            recebeHoraFimEventoPAluno.setText(list.get(index).getHoraFim());
            recebeAreaEventoPAluno.setText(list.get(index).getArea());
            recebeVagasEventoPAluno.setText(list.get(index).getVagas());
            recebeCargaHEventoPAluno.setText(list.get(index).getCargaHoraria());
            
            CardLayout c1 = (CardLayout) jPrincipal.getLayout();
            c1.show(jPrincipal, "VisEventoAluno");
    }//GEN-LAST:event_jButton49ActionPerformed
    private void listaSubEventoSistemaAluno(){
        
         int index = listaEventosPAluno.getSelectedIndex();
                        
            ArrayList<Evento> list = new ArrayList();
            FindEvento evento = new FindEvento();
            list = evento.findAll();
        
        ArrayList<Subevento> listSub = new ArrayList();
        FindSubevento subEvento = new FindSubevento();
        listSub = subEvento.findAll(list.get(index).getId_evento());
        DefaultListModel DML = new DefaultListModel();
        
        for (int i = 0; i < listSub.size(); i++) {
            DML.addElement("Id(" + listSub.get(i).getId_subevento() + ") " + listSub.get(i).getNomesubevento());
        }
        
        listaSubEventosPAluno.setModel(DML);
    }
    private void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton50ActionPerformed
        CardLayout c1 = (CardLayout) jPrincipal.getLayout();
        c1.show(jPrincipal, "subEventoAluno");
        listaSubEventoSistemaAluno();
    }//GEN-LAST:event_jButton50ActionPerformed

    private void botExcluirAlunoPAdm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botExcluirAlunoPAdm1ActionPerformed
        int index_2 = listaAlunosPAdm.getSelectedIndex();
                        
            ArrayList<Aluno> listou = new ArrayList();
            FindAluno alun = new FindAluno();
            listou = alun.findAll();
            aluno = listou.get(index_2);
            recebeNomeAluno.setText(listou.get(index_2).getNome());
            recebeEmailAluno.setText(listou.get(index_2).getEmail());
            recebeCpfAluno.setText(listou.get(index_2).getCpf());

        CardLayout c1 = (CardLayout) jPrincipal.getLayout();
        c1.show(jPrincipal, "visAlunoAdm");
    }//GEN-LAST:event_botExcluirAlunoPAdm1ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        CardLayout c1 = (CardLayout) jPrincipal.getLayout();
        c1.show(jPrincipal, "addSubEventoSistema");
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        try {
            JOptionPane.showMessageDialog(null, "Relatório gerado!");
            Gerar gr = new Gerar(even.getId_evento(), even.getNomeEvento());
        } catch (SQLException ex) {
            Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        CardLayout c1 = (CardLayout) jPrincipal.getLayout();
        c1.show(jPrincipal, "recuperarSenha");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void botRecuperarAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botRecuperarAdmActionPerformed
        RecuperaSenha rs = new RecuperaSenha(espacoTxtRecuperarSenha.getText(), "adm");
        CardLayout c1 = (CardLayout) jPrincipal.getLayout();
        c1.show(jPrincipal, "LoginAdm");
    }//GEN-LAST:event_botRecuperarAdmActionPerformed

    private void botCancRecuperarAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCancRecuperarAdmActionPerformed
        CardLayout c1 = (CardLayout) jPrincipal.getLayout();
        c1.show(jPrincipal, "LoginAdm");
    }//GEN-LAST:event_botCancRecuperarAdmActionPerformed

    private void botEntrarAdm4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botEntrarAdm4ActionPerformed
        RecuperaSenha rs = new RecuperaSenha(espacoTxtRecuperarSenha1.getText(), "aluno");
        CardLayout c1 = (CardLayout) jPrincipal.getLayout();
        c1.show(jPrincipal, "LoginAluno");
    }//GEN-LAST:event_botEntrarAdm4ActionPerformed

    private void botEntrarAdm5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botEntrarAdm5ActionPerformed
        CardLayout c1 = (CardLayout) jPrincipal.getLayout();
        c1.show(jPrincipal, "LoginAluno");
    }//GEN-LAST:event_botEntrarAdm5ActionPerformed

    private void botEntrarAluno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botEntrarAluno1ActionPerformed
        CardLayout c1 = (CardLayout) jPrincipal.getLayout();
        c1.show(jPrincipal, "recuperarSenhaAluno");
    }//GEN-LAST:event_botEntrarAluno1ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        
        int index1 = listaEventosPAluno.getSelectedIndex();
        int index = listaSubEventosPAluno.getSelectedIndex();
        
            ArrayList<Evento> listo = new ArrayList();
            FindEvento eventos = new FindEvento();
            listo = eventos.findAll();
            
            ArrayList<Subevento> listou = new ArrayList();
            FindSubevento subevento = new FindSubevento();
            listou = subevento.findAll(listo.get(index1).getId_evento());
            //subev = listou.get(index);
            
            recebeNomeSubEventoPAluno.setText(listou.get(index).getNomesubevento());
            recebeCargaHSubEventoPAluno.setText(listou.get(index).getCargahoraria());
            recebeDataSubEventoPAluno.setText(listou.get(index).getDatasub());
            recebeEnderecoSubEventoPAluno.setText(listou.get(index).getEndereco());
            recebeHoraFimSubEventoPAluno.setText(listou.get(index).getHorafim());
            recebeHoraInicioSubEventoPAluno.setText(listou.get(index).getHorainicio());
            recebeVagasSubEventoPAluno.setText(listou.get(index).getVagas());
        
        FindPalestrante fP2 = new FindPalestrante();
        Palestrante p2 = fP2.findOne(listou.get(index).getId_subevento());
        recebeNomePalestrantePAluno.setText(p2.getNomecompleto());
        recebeEmailPalestrantePAluno2.setText(p2.getEmail());
        recebeTelefonePalestrantePAluno1.setText(p2.getTelefone());
        
        CardLayout c1 = (CardLayout) jPrincipal.getLayout();
        c1.show(jPrincipal, "visSubEventoAluno");
    }//GEN-LAST:event_jButton44ActionPerformed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
        CardLayout c1 = (CardLayout) jPrincipal.getLayout();
        c1.show(jPrincipal, "VisEventoAluno");
    }//GEN-LAST:event_jButton45ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        int index = listaEventosPAdm.getSelectedIndex();
                        
            ArrayList<Evento> list = new ArrayList();
            FindEvento evento = new FindEvento();
            list = evento.findAll();
        
        CardLayout c1 = (CardLayout) jPrincipal.getLayout();
        c1.show(jPrincipal, "editarEventoAdm");
        RecebeTxtNomeEvento.setText(list.get(index).getNomeEvento());
        RecebeTxtDataInicioEvento.setText(list.get(index).getDataAbertura());
        RecebeTxtDataFimEvento.setText(list.get(index).getDataEncerra());
        RecebeTxtHoraInicioEvento.setText(list.get(index).getHoraInicio());
        RecebeTxtHoraFEvento.setToolTipText(list.get(index).getHoraFim());
        RecebeTxtEnderecoEvento.setText(list.get(index).getEndereco());
        RecebeTxtAreaEvento.setText(list.get(index).getArea());
        RecebeTxtVagasEvento.setText(list.get(index).getVagas());
        RecebeTxtCargaHEvento.setText(list.get(index).getCargaHoraria());
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        int index = listaEventosPAdm.getSelectedIndex();
                        
            ArrayList<Evento> list = new ArrayList();
            FindEvento evento = new FindEvento();
            list = evento.findAll();
            
            Delete_evento d3 = new Delete_evento(list.get(index).getId_evento());
            
            listaEventoSistema ();
            
            CardLayout c1 = (CardLayout) jPrincipal.getLayout();
            c1.show(jPrincipal, "gerenciarEventoAdm");
    }//GEN-LAST:event_jButton41ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField ConfSenhaAtualAluno;
    private javax.swing.JTextField EspacoTxtEmaiAluno;
    private javax.swing.JFormattedTextField HorFiimEvento;
    private javax.swing.JFormattedTextField HorInicioEvento;
    private javax.swing.JLabel Informação;
    private javax.swing.JLabel Informação1;
    private javax.swing.JLabel Informação2;
    private javax.swing.JTextField RecebeTxtAreaEvento;
    private javax.swing.JTextField RecebeTxtCargaHEvento;
    private javax.swing.JFormattedTextField RecebeTxtDataFimEvento;
    private javax.swing.JFormattedTextField RecebeTxtDataInicioEvento;
    private javax.swing.JTextField RecebeTxtEnderecoEvento;
    private javax.swing.JFormattedTextField RecebeTxtHoraFEvento;
    private javax.swing.JPanel RecebeTxtHoraFimEvento;
    private javax.swing.JFormattedTextField RecebeTxtHoraInicioEvento;
    private javax.swing.JTextField RecebeTxtNomeEvento;
    private javax.swing.JTextField RecebeTxtVagasEvento;
    private javax.swing.JPasswordField TxtSenhaLoginAluno;
    private javax.swing.JPanel VisEventoAluno;
    private javax.swing.JPanel addAlunoSistema;
    private javax.swing.JPanel addEventoSistema;
    private javax.swing.JPanel addSubEventoSistema;
    private javax.swing.JButton botAddAlunoPAdm;
    private javax.swing.JButton botCadastraAdm;
    private javax.swing.JButton botCancCadAdm;
    private javax.swing.JButton botCancCadAdm1;
    private javax.swing.JButton botCancCadAdm2;
    private javax.swing.JButton botCancCadAdm3;
    private javax.swing.JButton botCancCadAdm4;
    private javax.swing.JButton botCancCadAdm5;
    private javax.swing.JButton botCancCadAdm6;
    private javax.swing.JButton botCancCadAdm7;
    private javax.swing.JButton botCancRecuperarAdm;
    private javax.swing.JButton botConfCadIns;
    private javax.swing.JButton botConfCadIns1;
    private javax.swing.JButton botConfCadIns2;
    private javax.swing.JButton botConfCadIns3;
    private javax.swing.JButton botConfCadIns4;
    private javax.swing.JButton botConfCadIns5;
    private javax.swing.JButton botConfCadIns6;
    private javax.swing.JButton botConfCadIns7;
    private javax.swing.JButton botEntrarAdm;
    private javax.swing.JButton botEntrarAdm4;
    private javax.swing.JButton botEntrarAdm5;
    private javax.swing.JButton botEntrarAluno;
    private javax.swing.JButton botEntrarAluno1;
    private javax.swing.JButton botExcluirAlunoPAdm;
    private javax.swing.JButton botExcluirAlunoPAdm1;
    private javax.swing.JButton botMudarLoginAdm;
    private javax.swing.JButton botMudarLoginAluno;
    private javax.swing.JButton botRecuperarAdm;
    private javax.swing.JButton botVoltarGerenciarSubEventoAdm;
    private javax.swing.JPanel cadastroAdm;
    private javax.swing.JPasswordField confNovaSenhaAluno;
    private javax.swing.JPasswordField confirmarSenhaEditarIns;
    private javax.swing.JFormattedTextField dataEventoFim;
    private javax.swing.JFormattedTextField dataEventoinicio;
    private javax.swing.JPanel editarAlunoSistema;
    private javax.swing.JPanel editarDadosAdm;
    private javax.swing.JPanel editarEventoAdm;
    private javax.swing.JPanel editarSubEventoAdm;
    private javax.swing.JTextField espTxtAreaEnsinoEvento;
    private javax.swing.JTextField espTxtCargaHEvento;
    private javax.swing.JTextField espTxtConfEmailInst;
    private javax.swing.JTextField espTxtConfEmailInst5;
    private javax.swing.JTextField espTxtEditarConfEmailInst;
    private javax.swing.JTextField espTxtVagasEvento;
    private javax.swing.JTextField espacoTxtCargaHSubEvento;
    private javax.swing.JLabel espacoTxtCpfAluno;
    private javax.swing.JFormattedTextField espacoTxtCpfAlunoPAdm;
    private javax.swing.JFormattedTextField espacoTxtDataSubEvento;
    private javax.swing.JTextField espacoTxtEditarEmailCadInst;
    private javax.swing.JTextField espacoTxtEditarNomeIns;
    private javax.swing.JTextField espacoTxtEmail;
    private javax.swing.JTextField espacoTxtEmailAluno;
    private javax.swing.JTextField espacoTxtEmailAlunoPAdm;
    private javax.swing.JTextField espacoTxtEmailCadInst;
    private javax.swing.JTextField espacoTxtEmailPalSubEvento;
    private javax.swing.JTextField espacoTxtEnderecoEventoInst;
    private javax.swing.JTextField espacoTxtEnderecoSubEvento;
    private javax.swing.JFormattedTextField espacoTxtHFimSubEvento;
    private javax.swing.JFormattedTextField espacoTxtHInicioSubEvento;
    private javax.swing.JTextField espacoTxtNomeAluno;
    private javax.swing.JTextField espacoTxtNomeAlunoPAdm;
    private javax.swing.JTextField espacoTxtNomeEvento;
    private javax.swing.JTextField espacoTxtNomeIns;
    private javax.swing.JTextField espacoTxtNomePalSubEvento;
    private javax.swing.JTextField espacoTxtNomeSubEvento;
    private javax.swing.JTextField espacoTxtRecuperarSenha;
    private javax.swing.JTextField espacoTxtRecuperarSenha1;
    private javax.swing.JPasswordField espacoTxtSenha;
    private javax.swing.JFormattedTextField espacoTxtTelefoneSubEvento;
    private javax.swing.JTextField espacoTxtVagasSubEvento;
    private javax.swing.JPanel eventoAluno;
    private javax.swing.JPanel gerenciarAlunoAdm;
    private javax.swing.JPanel gerenciarContaAdm;
    private javax.swing.JPanel gerenciarEventoAdm;
    private javax.swing.JPanel gerenciarSubEvento;
    private javax.swing.JPanel inter;
    private javax.swing.JPanel inter1;
    private javax.swing.JPanel inter10;
    private javax.swing.JPanel inter11;
    private javax.swing.JPanel inter12;
    private javax.swing.JPanel inter3;
    private javax.swing.JPanel inter4;
    private javax.swing.JPanel inter5;
    private javax.swing.JPanel inter6;
    private javax.swing.JPanel inter7;
    private javax.swing.JPanel inter8;
    private javax.swing.JPanel inter9;
    private javax.swing.JButton jBotLoginAdm;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jEscolhaLogin;
    private javax.swing.JFormattedTextField jFormattedTextField20;
    private javax.swing.JPanel jInserirDadosAdm;
    private javax.swing.JPanel jInserirDadosAdm2;
    private javax.swing.JPanel jInserirDadosAdm3;
    private javax.swing.JPanel jInserirDadosAluno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jLoginAdm;
    private javax.swing.JPanel jLoginAluno;
    private javax.swing.JPanel jMenu;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPanel jPrincipal;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JLabel jTxtAluno;
    private javax.swing.JLabel jTxtInstituição;
    private javax.swing.JList<String> listaAlunosPAdm;
    private javax.swing.JList<String> listaEventosPAdm;
    private javax.swing.JList<String> listaEventosPAluno;
    private javax.swing.JList<String> listaSubEventosPAdm;
    private javax.swing.JList<String> listaSubEventosPAluno;
    private javax.swing.JPasswordField novaSenhaAluno;
    private javax.swing.JPanel perfilAdm;
    private javax.swing.JPanel perfilAluno;
    private javax.swing.JLabel recebeAreaEventoInf;
    private javax.swing.JLabel recebeAreaEventoPAluno;
    private javax.swing.JLabel recebeCargaHEventoInf;
    private javax.swing.JLabel recebeCargaHEventoPAluno;
    private javax.swing.JLabel recebeCargaHSubEventoInf;
    private javax.swing.JLabel recebeCargaHSubEventoInf2;
    private javax.swing.JLabel recebeCargaHSubEventoPAluno;
    private javax.swing.JLabel recebeCnpjIns;
    private javax.swing.JLabel recebeCpfAluno;
    private javax.swing.JLabel recebeDataFimEventoInf;
    private javax.swing.JLabel recebeDataFimEventoPAluno;
    private javax.swing.JLabel recebeDataInicioEventoInf;
    private javax.swing.JLabel recebeDataInicioEventoPAluno;
    private javax.swing.JLabel recebeDataInicioSubEventoInf;
    private javax.swing.JLabel recebeDataSubEventoPAluno;
    private javax.swing.JLabel recebeEmailAluno;
    private javax.swing.JLabel recebeEmailPalestrante;
    private javax.swing.JLabel recebeEmailPalestrantePAluno2;
    private javax.swing.JLabel recebeEnderecoEventoInf;
    private javax.swing.JLabel recebeEnderecoEventoPAluno;
    private javax.swing.JLabel recebeEnderecoSubEventoInf;
    private javax.swing.JLabel recebeEnderecoSubEventoPAluno;
    private javax.swing.JLabel recebeHoraFimEventoInf;
    private javax.swing.JLabel recebeHoraFimEventoPAluno;
    private javax.swing.JLabel recebeHoraFimSubEventoInf;
    private javax.swing.JLabel recebeHoraFimSubEventoPAluno;
    private javax.swing.JLabel recebeHoraInicioEventoInf;
    private javax.swing.JLabel recebeHoraInicioEventoPAluno;
    private javax.swing.JLabel recebeHoraInicioSubEventoInf;
    private javax.swing.JLabel recebeHoraInicioSubEventoPAluno;
    private javax.swing.JLabel recebeNomeAluno;
    private javax.swing.JLabel recebeNomeEventoInf;
    private javax.swing.JLabel recebeNomeEventoPAluno;
    private javax.swing.JLabel recebeNomePalestrante;
    private javax.swing.JLabel recebeNomePalestrantePAluno;
    private javax.swing.JLabel recebeNomeSubEventoInf;
    private javax.swing.JLabel recebeNomeSubEventoPAluno;
    private javax.swing.JLabel recebeTelefonePalestrantePAluno1;
    private javax.swing.JLabel recebeTelefonelPalestrante;
    private javax.swing.JTextField recebeTxtCargaHSubEvento;
    private javax.swing.JFormattedTextField recebeTxtDataSubEvento;
    private javax.swing.JTextField recebeTxtEnderecoSubEvento;
    private javax.swing.JFormattedTextField recebeTxtHoraFimSubEvento;
    private javax.swing.JFormattedTextField recebeTxtHoraInicioSubEvento;
    private javax.swing.JTextField recebeTxtNomeSubEvento;
    private javax.swing.JTextField recebeTxtVagasSubEvento;
    private javax.swing.JLabel recebeVagasEventoInf;
    private javax.swing.JLabel recebeVagasEventoPAluno;
    private javax.swing.JLabel recebeVagasSubEventoInf;
    private javax.swing.JLabel recebeVagasSubEventoPAluno;
    private javax.swing.JPanel recuperarSenhaAdm;
    private javax.swing.JPanel recuperarSenhaAluno;
    private javax.swing.JPanel selecaoDadosInst;
    private javax.swing.JPanel selecaoDadosInst1;
    private javax.swing.JPanel selecaoDadosInst2;
    private javax.swing.JPanel selecaoDadosInst3;
    private javax.swing.JPanel selecaoDadosInst4;
    private javax.swing.JPanel selecaoDadosInst5;
    private javax.swing.JPanel selecaoDadosInst7;
    private javax.swing.JPasswordField senhaEditarIns;
    private javax.swing.JPanel subEventoAluno;
    private javax.swing.JLabel txtAluno;
    private javax.swing.JFormattedTextField txtCnpj;
    private javax.swing.JLabel txtEmail;
    private javax.swing.JLabel txtEmail2;
    private javax.swing.JLabel txtEmail3;
    private javax.swing.JLabel txtEmailAluno;
    private javax.swing.JLabel txtInstucional;
    private javax.swing.JLabel txtInstucional2;
    private javax.swing.JLabel txtInstucional3;
    private javax.swing.JLabel txtSenha;
    private javax.swing.JLabel txtSenhaAluno;
    private javax.swing.JPanel visAlunoAdm;
    private javax.swing.JPanel visEventoAdm;
    private javax.swing.JPanel visSubEvento;
    private javax.swing.JPanel visSubEventoAluno;
    // End of variables declaration//GEN-END:variables
}