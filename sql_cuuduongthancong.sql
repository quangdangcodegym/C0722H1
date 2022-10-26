select * from sanpham
where NuocSX = 'Trung Quoc';


select * from sanpham
where MASP like 'B%01';

select * from hoadon
where NgayMuaHang between '2007-1-1' and '2007-1-2';

-- 9. In ra danh sách các sản phẩm (MASP,TENSP) 
-- được khách hàng có tên “Nguyễn Văn A” mua trong háng 10/2000
select sp.MASP, sp.TenSP from sanpham sp join cthd ct on sp.MaSP = ct.MaSP 
join hoadon hd on hd.SoHoaDon = ct.SoHD
join khachhang kh on kh.MaKH = hd.MaKH 
where kh.HoTen like 'Nguyen Van A' and hd.NgayMuaHang like '2006-10-%';

-- Cau lenh IN
SELECT * FROM student where ClassId in (select ClassID from class);



-- 15. In ra danh sách các sản phẩm (MASP,TENSP) không bán được.
select *
from sanpham s
where s.MaSP not in (select sp.MaSP
from sanpham sp join cthd ct on sp.MaSP = ct.MaSP);

-- 22. Tìm số hóa đơn có trị giá cao nhất trong năm 2006
select max(hd.TriGia), hd.NgayMuaHang
from hoadon hd
where hd.NgayMuaHang like '2006%';


