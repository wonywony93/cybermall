insert into product_info values('aaaa1','������� ĳ�� �긯','45000','99','���̾��� ��Ű�� �ִ� ������ ���� ĳ�� �긯�� 417�� �ǽ��� �����Ǿ����ϴ�.
�ҵ��ҵ�~ ưư�� ������ ĳ���� ���� �������!
ĳ�� ���ε� �Ʊ��ڱ��ϰ� �ٹ� �� �־��.');
insert into product_info values('aaaa2','�������ī������-���̾�','15000','10','�� �տ� �� ������ ũ���� ī�������Դϴ�.');
insert into product_info values('aaaa3','������� �̴�����_����ġ','12000','80',
'���̰��� �� �� �̸�ŭ �� �ȳ��� ������ �־��?  
�츮�� ��������� ����� ����! ǳ��� ������ ťƮ ����Ʈ�� �����ߴ�ϴ�.');
insert into product_info values('aaaa4','���κ���_��ƲƩ������','29000','80','����� �������� ��̰�! ��Ư�� �Ϳ�� ��Ʋ���κ��� ������� �Բ��ؿ�~
�Ϳ��� ���� ��ȭ�� ������ �� �͵� �߶��� ��Ʋ�������� �ູ�� ���̴ϵ���!');
insert into product_info values('aaaa5','������_��Ʋ���̾� �޼��� ����','27000','70','Ư���� �� ������ ���ϴ� Ư���� ���! ��Ʋ������ �޽��������� �����ٰԿ�~
���̾��� �հ� �޽��� ī�忡 �ڼ��� �־� �ٿ��� ������ �� �� �־��.');
insert into product_info values('aaaa6','������_�ڵ����� �׿�','17000','70','
īī�������� �ڵ�����! �������� ��õǾ����
�տ� �� ���� ������� ��Ҹ��� �������� �����ּ���.
���̵鿡�� ��ȭå�� �о��ְų� ���� ���̸� �� ���� Ȱ���� �� �־��');
insert into product_info values('aaaa7','�ܿ����','10000','100','�� ������Դϴ�.');

insert into product_images values('aaaa1','product1_1','product1_2','product1_3','product1_4','product1_5');
insert into product_images values('aaaa2','product2_1','product2_2','product2_3','product2_4','product2_5');
insert into product_images values('aaaa3','product3_1','product3_2','product3_3','product3_4','product3_5');
insert into product_images values('aaaa4','product4_1','product4_2','product4_3','product4_4','product4_5');
insert into product_images values('aaaa5','product5_1','product5_2','product5_3','product5_4','product5_5');
insert into product_images values('aaaa6','product6_1','product6_2','product6_3','product6_4','product6_5');
insert into product_images values('aaaa7','product7_1','product7_2','product7_3','product7_4','product7_5');
insert into product_images values('aaaa8','product8_1','product8_2','product8_3','product8_4','product8_5');
insert into product_images values('aaaa9','product9_1','product9_2','product9_3','product9_4','product9_5');
insert into product_images values('aaaa10','product10_1','product10_2','product10_3','product10_4','product10_5');

select a.code,b.img1 from product_info a inner join product_images b on a.code=b.code 


select * from product_info;
