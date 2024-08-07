class test{

	public static void main(String args[]){
		System.out.println("Right Half Pyramid");
		int i,j;
		for(i=1;i<=5;i++){
			for(j=1;j<=i;j++){
				System.out.print("*");
			}
		System.out.println();
		}

		System.out.println();
		System.out.println("Reverse Right Half Pyramid");
		int k,l;
		for(k=1;k<=5;k++){
			for(l=5;l>=k;l--){
				System.out.print("*");
			}
		System.out.println();
		}

		System.out.println();
		System.out.println("Left Half Pyramid");
		int m,n,o;
		for(m=1;m<=5;m++){
			for(n=5;n>=m;n--){
				System.out.print(" ");
			}
			for(o=1;o<=m;o++){
				System.out.print("*");
			}
		System.out.println();
		}
		
		System.out.println();
		System.out.println("Reverse Left Half Pyramid");
		int a,b,c;
		for(a=1;a<=5;a++){
			for(b=1;b<=a;b++){
				System.out.print(" ");
			}
			for(c=5;c>=a;c--){
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("K Pattern");

		int p,q,r,s;
		for(r=1;r<=5;r++){
			for(s=5;s>=r;s--){
				System.out.print("*");
			}
			System.out.println();
		}
		for(p=4;p>=1;p--){
			for(q=5;q>=p;q--){
				System.out.print("*");
			}
		System.out.println();
		}
	
		System.out.println();
		System.out.println("Triangle Star Pattern");

		int e,f,g;
		for(e=1;e<=5;e++){
			for(f=5;f>=e;f--){
				System.out.print(" ");
			}
			for(g=1;g<=e;g++){
				System.out.print(" *");
			}
		System.out.println();
		}
		
		System.out.println();
		System.out.println("Diamond Pattern");

		int w,x,y,z,h,t;
		for(w=1;w<=4;w++){
			for(x=5;x>=w;x--){
					System.out.print(" ");
				}
			for(y=1;y<=w;y++){
					System.out.print(" *");
				}
			System.out.println();
			}
			for(z=1;z<=5;z++){
				for(h=1;h<=z;h++){
					System.out.print(" ");
				}
				for(t=5;t>=z;t--){
					System.out.print(" *");
				}
				
			System.out.println();
			}

		System.out.println();
		System.out.println("Square Fill Pattern");
		int bm,be,bu;
		for(bm=1;bm<=5;bm++){
			for(be=5;be>=bm;be--){
				System.out.print("*");
				}
			for(bu=1;bu<=bm;bu++){
				System.out.print("*");
				}
		System.out.println();
		}

		System.out.println();
		System.out.println("Rhombus Pattern");
		
		int ab,ac,ad,ae;
		for(ab=1;ab<=5;ab++){
			for(ac=1;ac<=ab;ac++){
				System.out.print(" ");
			}
			for(ad=5;ad>=ab;ad--){
				System.out.print("*");
			}
			for(ae=1;ae<=ab;ae++){
				System.out.print("*");
			}
		System.out.println();
	
		}

		System.out.println();
		System.out.println("Right Pascal's Triangle Pattern");

		int ba,bb,bc,bd;

		for(ba=1;ba<=3;ba++){
			for(bb=1;bb<=ba;bb++){
				System.out.print(" *");
			}
		
			System.out.println();
		}
		for(bc=1;bc<=4;bc++){
			for(bd=4;bd>=bc;bd--){
				System.out.print(" *");
				}
			
			System.out.println();
		}


		System.out.println();

		System.out.println("Butterfly Star Pattern");

		int ca,cb,cc,cd;

		
		

	}
}