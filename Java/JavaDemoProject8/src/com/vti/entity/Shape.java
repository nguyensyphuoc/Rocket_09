package com.vti.entity;

public class Shape {
    private int id;
    private DienTichChuVi dienTichChuVi;

    private class DienTichChuVi {
        private int dienTich;
        private int chuVi;

        public int getDienTich() {
            return dienTich;
        }

        public void setDienTich(int dienTich) {
            this.dienTich = dienTich;
        }

        public int getChuVi() {
            return chuVi;
        }

        public void setChuVi(int chuVi) {
            this.chuVi = chuVi;
        }
    }


}
