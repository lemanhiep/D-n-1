package Polypro;

import dao.hocVienDAO;
import dao.nguoiHocDAO;
import helper.dateHelper;
import helper.dialogHelper;
import helper.shareHelper;
import helper.utilityHelper;
import static java.awt.Color.pink;
import static java.awt.Color.white;
import java.awt.HeadlessException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.hocVien;
import model.nguoiHoc;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author
 */
public class nguoiHocJInternalFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form nguoiHocJInternalFrame
     */
    public nguoiHocJInternalFrame() {
        initComponents();
        init();
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
        tabs = new javax.swing.JTabbedPane();
        pnlEdit = new javax.swing.JPanel();
        txtMaNH = new javax.swing.JTextField();
        txtHoTen = new javax.swing.JTextField();
        cboGioiTinh = new javax.swing.JComboBox<>();
        txtEmail = new javax.swing.JTextField();
        txtDienThoai = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtGhiChu = new javax.swing.JTextArea();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnFirst = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        txtNgaySinh = new javax.swing.JTextField();
        pnlList = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblGridView = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("QUẢN LÝ NGƯỜI HỌC");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ NGƯỜI HỌC");
        getContentPane().add(jLabel1, java.awt.BorderLayout.PAGE_START);

        txtMaNH.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtMaNH.setName("Mã người học"); // NOI18N
        txtMaNH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaNHActionPerformed(evt);
            }
        });

        txtHoTen.setName("Họ và tên"); // NOI18N

        cboGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));

        txtEmail.setName("Địa chỉ email"); // NOI18N

        txtDienThoai.setName("Điện thoại"); // NOI18N

        txtGhiChu.setColumns(20);
        txtGhiChu.setRows(5);
        jScrollPane1.setViewportView(txtGhiChu);

        btnInsert.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnInsert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Add to basket.png"))); // NOI18N
        btnInsert.setText("Thêm");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Notes.png"))); // NOI18N
        btnUpdate.setText("Sửa");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Delete.png"))); // NOI18N
        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Unordered list.png"))); // NOI18N
        btnClear.setText("Mới");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jLabel8.setText("Ghi chú");

        jLabel6.setText("Điện thoại");

        jLabel7.setText("Địa chỉ Email");

        jLabel5.setText("Ngày sinh");

        jLabel4.setText("Giới tính");

        jLabel3.setText("Họ và tên");

        jLabel2.setText("Mã người học");

        btnFirst.setBackground(new java.awt.Color(51, 51, 255));
        btnFirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/dau.png"))); // NOI18N
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnPrev.setBackground(new java.awt.Color(51, 51, 255));
        btnPrev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/lui.png"))); // NOI18N
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        btnNext.setBackground(new java.awt.Color(255, 153, 0));
        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/tien.png"))); // NOI18N
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnLast.setBackground(new java.awt.Color(255, 153, 0));
        btnLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cuoi.png"))); // NOI18N
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        txtNgaySinh.setName("Ngày sinh"); // NOI18N

        javax.swing.GroupLayout pnlEditLayout = new javax.swing.GroupLayout(pnlEdit);
        pnlEdit.setLayout(pnlEditLayout);
        pnlEditLayout.setHorizontalGroup(
            pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(txtMaNH)
                    .addComponent(txtHoTen)
                    .addGroup(pnlEditLayout.createSequentialGroup()
                        .addComponent(btnInsert)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnClear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                        .addComponent(btnFirst)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPrev)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLast))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEditLayout.createSequentialGroup()
                        .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlEditLayout.createSequentialGroup()
                                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8))
                                .addGap(0, 265, Short.MAX_VALUE))
                            .addComponent(txtDienThoai)
                            .addComponent(cboGioiTinh, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                .addComponent(txtEmail))
                            .addComponent(jLabel7))))
                .addContainerGap())
        );
        pnlEditLayout.setVerticalGroup(
            pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMaNH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsert)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnClear)
                    .addComponent(btnFirst)
                    .addComponent(btnPrev)
                    .addComponent(btnNext)
                    .addComponent(btnLast))
                .addGap(28, 28, 28))
        );

        tabs.addTab("CẬP NHẬT", new javax.swing.ImageIcon(getClass().getResource("/icon/Edit.png")), pnlEdit, "Cập nhật"); // NOI18N

        pnlList.setLayout(new java.awt.BorderLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("TÌM KIẾM"));
        jPanel1.setLayout(new java.awt.BorderLayout());

        txtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemActionPerformed(evt);
            }
        });
        jPanel1.add(txtTimKiem, java.awt.BorderLayout.CENTER);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Zoom.png"))); // NOI18N
        jButton5.setText("Tìm");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, java.awt.BorderLayout.LINE_END);

        pnlList.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        tblGridView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "MÃ NH", "HỌ VÀ TÊN", "GIỚI TÍNH", "NGÀY SINH", "ĐIỆN THOẠI", "EMAIL", "MÃ NV", "NGÀY ĐK"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblGridView.setRowHeight(25);
        tblGridView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGridViewMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblGridView);
        if (tblGridView.getColumnModel().getColumnCount() > 0) {
            tblGridView.getColumnModel().getColumn(0).setPreferredWidth(60);
            tblGridView.getColumnModel().getColumn(1).setPreferredWidth(150);
            tblGridView.getColumnModel().getColumn(2).setPreferredWidth(50);
            tblGridView.getColumnModel().getColumn(4).setPreferredWidth(80);
            tblGridView.getColumnModel().getColumn(5).setPreferredWidth(140);
            tblGridView.getColumnModel().getColumn(6).setPreferredWidth(50);
        }

        pnlList.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        tabs.addTab("DANH SÁCH", new javax.swing.ImageIcon(getClass().getResource("/icon/List.png")), pnlList, "Danh sách"); // NOI18N

        getContentPane().add(tabs, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int index = 0;   //vị trí nguoiHoc đang được chọn
    nguoiHocDAO dao = new nguoiHocDAO();

    void init() {
        setFrameIcon(shareHelper.APP_ICON_1);  //set Icon cho JInternalFrame
        tabs.setSelectedIndex(1);     //chuyển tabPanel sang tab thứ 2
    }

    //tìm kiếm người học theo keyword rồi đổ list người học vào bảng
    //nếu không có keywork trong ô tìm kiếm thì đổ toàn bộ người học trong CSDL vào bảng
    void load() {
        //kết nối nội dung bảng (model) với thùng chứa bảng (tblGridView)
        DefaultTableModel model = (DefaultTableModel) tblGridView.getModel();
        model.setRowCount(0);   //đưa số dòng bảng về 0 (xóa bảng)
        try {
            //tìm người học theo keywork
            //nếu ko có keywork thì sẽ là tất cả người học
            String keyword = txtTimKiem.getText();
            List<nguoiHoc> list = dao.selectByKeyword(keyword);
            //đưa list tìm được lên bảng
            for (nguoiHoc nh : list) {
                Object[] row = {
                    nh.getMaNH(),
                    nh.getHoTen(),
                    nh.isGioiTinh() ? "Nam" : "Nữ",
                    dateHelper.toString(nh.getNgaySinh()),
                    nh.getDienThoai(),
                    nh.getEmail(),
                    nh.getMaNV(),
                    dateHelper.toString(nh.getNgayDK())
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            dialogHelper.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    //lấy thông tin trên form để
    //thêm 1 nguoiHoc mới vào CSDL (vẫn insertable)
    void insert() {
        nguoiHoc model = getModel();   //lấy thông tin trên form gán cho đt nguoiHoc
        try {
            dao.insert(model);    //thêm bản ghi mới vào CSDL theo tt từ nguoiHoc
            this.load();            //đổ thông tin mới vào bảng
            this.clear();           //xóa trằng form và vẫn để ở chế độ insertable
            dialogHelper.alert(this, "Thêm mới thành công!");
        } catch (Exception e) {
            dialogHelper.alert(this, "Thêm mới thất bại!");
        }
    }

    //lấy thông tin trên form
    //để chỉnh sửa nguoiHoc trong CSDL theo maNH
    void update() {
        nguoiHoc model = getModel(); //lấy thông tin form gán cho đt nguoiHoc
        try {
            dao.update(model);   //chỉnh sửa bản ghi theo tt từ nguoiHoc 
            this.load();         //đổ tt mới từ CSDL vào bảng
            dialogHelper.alert(this, "Cập nhật thành công!");
        } catch (Exception e) {
            dialogHelper.alert(this, "Cập nhật thất bại!");
        }
    }

    //xóa bản ghi khỏi CSDL theo maNH lấy trên form
    //xóa trằng form và chuyển sang insertable
    void delete() {
        if (dialogHelper.confirm(this, "Bạn thực sự muốn xóa người học này?")) {
            String manh = txtMaNH.getText();
            try {
                dao.delete(manh);
                this.load();
                this.clear();
                dialogHelper.alert(this, "Xóa thành công!");
            } catch (Exception e) {
                String sql="select * from NguoiHoc where MaNH in (select NguoiHoc.MaNH from NguoiHoc join HocVien on NguoiHoc.MaNH=HocVien.MaNH)";
                List<nguoiHoc> list=dao.select(sql);
                for(nguoiHoc x: list){
                    if(x.getMaNH().equalsIgnoreCase(manh)){
                        hocVienDAO hvdao=new hocVienDAO();
                        String sql3="select * from HocVien where MaNH like ?";
                        List<hocVien> listhv=hvdao.select(sql3, manh);
                        String cacKH="";
                        for(hocVien xyz: listhv){
                            cacKH=cacKH+"  "+xyz.getMaKH();
                        }
                        dialogHelper.alert(this, "Người học này đang trong khóa học:"+cacKH+"\nbạn phải xóa học viên này khỏi tất cả các khóa học\ntrước khi xóa người học");
                        return;
                    }
                }
                dialogHelper.alert(this, "Xóa thất bại!");
            }
        }
    }

    public void setTrang() {
        txtMaNH.setBackground(white);
        txtHoTen.setBackground(white);
        txtNgaySinh.setBackground(white);
        txtDienThoai.setBackground(white);
        txtEmail.setBackground(white);
    }

    //xóa trằng form, ngayDK lấy ngày hôm nay, maNV tạo lấy maNV đang đăng nhập
    //chuyển sang insertable
    void clear() {
        setTrang();
        nguoiHoc model = new nguoiHoc();
        model.setMaNV(shareHelper.USER.getMaNV());
        model.setNgayDK(dateHelper.now());
        this.setModel(model);
        setStatus(true);
    }

    //điền thông tin lên form theo index
    //chuyển sang trạng thái editable
    void edit() {
        setTrang();
        try {
            String manh = (String) tblGridView.getValueAt(this.index, 0); //lấy maNH theo index
            nguoiHoc model = dao.findById(manh);    //lấy nguoiHoc theo maNH
            if (model != null) {
                this.setModel(model);   //điền thông tin lên form theo nguoiHoc
                this.setStatus(false);
            }
        } catch (Exception e) {
            dialogHelper.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    //điền thông tin từ đối tượng nguoiHoc lên form
    void setModel(nguoiHoc model) {
        txtMaNH.setText(model.getMaNH());
        txtHoTen.setText(model.getHoTen());
        cboGioiTinh.setSelectedIndex(model.isGioiTinh() ? 0 : 1);
        txtNgaySinh.setText(dateHelper.toString(model.getNgaySinh()));
        txtDienThoai.setText(model.getDienThoai());
        txtEmail.setText(model.getEmail());
        txtGhiChu.setText(model.getGhiChu());
    }

    //lấy thông trên form  cho vào đối tượng nguoiHoc
    //return nguoiHoc
    nguoiHoc getModel() {
        nguoiHoc model = new nguoiHoc();
        model.setMaNH(txtMaNH.getText());
        model.setHoTen(txtHoTen.getText());
        model.setGioiTinh(cboGioiTinh.getSelectedIndex() == 0);
        model.setNgaySinh(dateHelper.toDate(txtNgaySinh.getText()));
        model.setDienThoai(txtDienThoai.getText());
        model.setEmail(txtEmail.getText());
        model.setGhiChu(txtGhiChu.getText());
        model.setMaNV(shareHelper.USER.getMaNV());
        model.setNgayDK(dateHelper.now());     //ngày đăng kí luôn là ngày hôm nay dù có sửa trên form
        return model;
    }

    /*
    insertable (true)
        enable: txtMaNH, btnInsert
        disable: btnDelete, btnUpdate, 4 nút điều hướng
    editable (false)     ngược lại
    btnClear lúc nào cũng enable
    ở đầu tiên disable first, prev, ở cuối cùng disable last, next
     */
    void setStatus(boolean insertable) {
        txtMaNH.setEditable(insertable);
        btnInsert.setEnabled(insertable);
        btnUpdate.setEnabled(!insertable);
        btnDelete.setEnabled(!insertable);
        boolean first = this.index > 0;
        boolean last = this.index < tblGridView.getRowCount() - 1;
        btnFirst.setEnabled(!insertable && first);
        btnPrev.setEnabled(!insertable && first);
        btnLast.setEnabled(!insertable && last);
        btnNext.setEnabled(!insertable && last);
    }

    //khi mở form đổ dữ liệu vào bảng
    //để ở trạng thái insertable
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        this.load();
        this.setStatus(true);
    }//GEN-LAST:event_formInternalFrameOpened

    //lấy vị trí dòng được chọn
    //hiển thị thông tin bản ghi lên form
    //chuyển sang trạng thái editable
    private void tblGridViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGridViewMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            this.index = tblGridView.rowAtPoint(evt.getPoint()); //lấy vị trí dòng được chọn
            if (this.index >= 0) {
                this.edit();
                tabs.setSelectedIndex(0);
            }
        }
    }//GEN-LAST:event_tblGridViewMouseClicked
    public boolean check16Nam(JTextField txt) {
        txt.setBackground(white);
        Date date = dateHelper.toDate(txt.getText());
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        c1.setTime(date);
        c2.setTime(new Date());
        long a = (c2.getTime().getTime() - c1.getTime().getTime()) / (24 * 3600 * 1000);
        if (a >= 5844) {
            return true;
        } else {
            txt.setBackground(pink);
            dialogHelper.alert(this, txt.getName() + " phải cách đây ít nhất 16 năm.");
            return false;
        }
    }

    public boolean checkTrungMa(JTextField txt) {
        txt.setBackground(white);
        if (dao.findById(txt.getText()) == null) {
            return true;
        } else {
            txt.setBackground(pink);
            dialogHelper.alert(this, txt.getName() + " đã bị tồn tại.");
            return false;
        }
    }
    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
        if (utilityHelper.checkNullText(txtMaNH)
                && utilityHelper.checkNullText(txtHoTen)
                && utilityHelper.checkNullText(txtNgaySinh)
                && utilityHelper.checkNullText(txtDienThoai)
                && utilityHelper.checkNullText(txtEmail)) {
            if (utilityHelper.checkMaNH(txtMaNH)
                    && utilityHelper.checkName(txtHoTen)
                    && utilityHelper.checkDate(txtNgaySinh)
                    && utilityHelper.checkSDT(txtDienThoai)
                    && utilityHelper.checkEmail(txtEmail)) {
                if (checkTrungMa(txtMaNH)) {
                    if (check16Nam(txtNgaySinh)) {
                        insert();
                    }
                }
            }
        }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        if (utilityHelper.checkNullText(txtHoTen)
                && utilityHelper.checkNullText(txtNgaySinh)
                && utilityHelper.checkNullText(txtDienThoai)
                && utilityHelper.checkNullText(txtEmail)) {
            if (utilityHelper.checkName(txtHoTen)
                    && utilityHelper.checkDate(txtNgaySinh)
                    && utilityHelper.checkSDT(txtDienThoai)
                    && utilityHelper.checkEmail(txtEmail)) {
                if (check16Nam(txtNgaySinh)) {
                    update();
                }
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        if (shareHelper.USER.isVaiTro()) {
            delete();
        } else {
            dialogHelper.alert(this, "Chỉ trưởng phòng mới được phép xóa");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here
        clear();
       
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        // TODO add your handling code here:
        this.index = 0;
        this.edit();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        // TODO add your handling code here:
        this.index--;
        this.edit();
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        this.index++;
        this.edit();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        // TODO add your handling code here:
        this.index = tblGridView.getRowCount() - 1;
        this.edit();
    }//GEN-LAST:event_btnLastActionPerformed

    //tìm list người học theo keywword đổ vào bảng
    //xóa trắng form và chuyển sang insertable
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.load();
        this.clear();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemActionPerformed

    private void txtMaNHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaNHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaNHActionPerformed
    
    public static void main(String[] args) {
        new nguoiHocJInternalFrame().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cboGioiTinh;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnlEdit;
    private javax.swing.JPanel pnlList;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblGridView;
    private javax.swing.JTextField txtDienThoai;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextArea txtGhiChu;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaNH;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
