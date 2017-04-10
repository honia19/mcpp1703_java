package Java_HW;



public class ConvertUpdate {
	

		static double Miles(double num) {
			
			double res = 0;
			res = 0.00062 * num;
			return res;
		}

		static double Yard(double num) 
		{
			
			double res = 0;
			res = 1.09 * num;
			return res;
		}

		static double Phut(double num) 
		{
			
			double res = 0;
			res = 3.28 * num;
			return res;
		}

		static double Sagen(double num) {
			
			double res = 0;
			res = (1 / 2.13) * num;
			return res;
		}

		static double CosoySagen(double num) {
			
			double res = 0;
			res = (1 / 3.02) * num;
			return res;
		}

		static double Posoch(double num) {
			
			double res = 0;
			res = (1 / 1.6) * num;
			return res;
		}

		static double Arshin(double num) 
		{
			
			double res = 0;
			res = (1 / 0.71) * num;
			return res;
		}

		static double Stoune(double num) 
		{
			
			double res = 0;
			res = (1 / 6.35) * num;
			return res;
		}

		static double Funt(double num) 
		{
			
			double res = 0;
			res = (2.20) * num;
			return res;
		}

		static double Uncia(double num) 
		{
			
			double res = 0;
			res = (35.2) * num;
			return res;
		}

		static double Pud(double num) 
		{
			
			double res = 0;
			res = (1 / 16.38) * num;
			return res;
		}

		static double Berck(double num) 
		{
			
			double res = 0;
			res = (1 / 163.8) * num;
			return res;
		}

		static double Butman(double num) 
		{
			
			double res = 0;
			res = (1 / 4.095) * num;
			return res;
		}

		static double Tonna(double num) 
		{
			
			double res = 0;
			res = (1 / 1000.0) * num;
			return res;
		}

		static double Kvarta(double num) 
		{
			double res = 0;
			res = 0.87 * num;
			return res;
		}

		static double Pinta(double num) 
		{
			
			double res = 0;
			res = (1.75) * num;
			return res;
		}

		static double Galon(double num) 
		{
			
			double res = 0;
			res = (1 / 3.8) * num;
			return res;
		}

		static double Barrel(double num) 
		{
			
			double res = 0;
			res = (1 / 159.0) * num;
			return res;
		}

		static double Anker(double num) 
		{
			
			double res;
			res = (1 / 36.0) * num;
			return res;
		}

		static double Vedro(double num) 
		{
		
			double res = 0;
			res = (0.08) * num;
			return res;
		}

		static double Shopen(double num) 
		{
			
			double res = 0;
			res = (1 / 0.5) * num;
			return res;
		}

		static double Secunda(double num) 
		{
			
			double res = 0;
			res = num * 60.0;
			return res;
		}

		static double Hour(double num) 
		{
			double res = 0;
			res = (1 / 60.0) * num;
			return res;
		}

		static double Days(double num) 
		{
			
			double res = 0;
			res = (1/1440.0) * num;
			return res;
		}

		static double AcademHour(double num) 
		{
			
			double res = 0;
			res = (1 / 45.0) * num;
			return res;
		}

		static double AstroHour(double num) 
		{
			
			double res = 0;
			res = (1 / 60.0) * num;
			return res;
		}

		static double ParaUniverse(double num) 
		{
			
			double res = 0;
			res = (1 / 85.0) * num;
			return res;
		}

		static double Milisec(double num) 
		{
			
			double res = 0;
			res = num * 60000;
			return res;
		}

		static double Farengate(double num) 
		{
			double res ;
			
				res = (num * 1.8) + 32.0;
			

			return res;
		}
		static double FarengateObratka(double num) 
		{
			double tmp=0;
			
		double res=(num - 32.0);
		tmp =  (5.0 / 9.0)*res ;
			

			return tmp;
		}
		

		static double Kelvin(double num) 
		{
			double res = 0;
			
				res = num + 273.15;
			

			return res;
		}
		static double KelvinObratka(double num) 
		{
			double res = 0;
			
				res = num - 273.15;
			

			return res;
		}

		static double Rankin(double num) 
		{
			double res = 0;
			
				res = (num * 1.8) + 491.67;
			

			return res;
		}
		static double RankinObratka(double num) 
		{
			double res = 0;
			
				res =5.0/9.0 * (num - 491.67);
			

			return res;
		}

		static double Demel(double num) 
		{
			double res = 0;
			if (num == 0)
				res = 150;
			else {
				res = (-1.5 * num) + 150;
			}

			return res;
		}
		static double DemelObratka(double num) 
		{
			double res = 0;
			
			
			res = -2.0/3.0*(-150.0+num);

			return res;
		}

		static double Reomur(double num) 
		{
			double res = 0;
			
			
				res = num * 0.8;
			

			return res;
		}
		static double ReomurObratka(double num) 
		{
			double res = 0;
			
				res = (num) * 10.0/8.0;
			

			return res;
		}

		static double Newton(double num) 
		{
			double res = 0;
			
				res = num * 0.33;
			

			return res;
		}
		static double NewtonObratka(double num) 
		{
		double res = 0;

		res = (num) * 10.0/3.3;

		return res;
		}

		static double Cels(double num) 
		{
			
			

			return num;
		}
		static double VolumeOfTemperature(double num, String in, String out)
		{
			if(in==null || out==null)
			{
				throw new IllegalArgumentException();
			}
			if(in==out)
			{
				return num;
			}
			double res=0;
			switch(in)
			{
			case "Kelvin": res=KelvinObratka(num);break;
			case "Farengate": res=FarengateObratka(num);break;
			case "Rankin": res=RankinObratka(num);break;
			case "Cels": res=Cels(num);break;
			case "Demel": res=DemelObratka(num);break;
			case "Reomur": res=ReomurObratka(num);break;
			case "Newton": res=NewtonObratka(num);break;

			}
			
			double temp=0;
			switch(out)
			{
			
			case "Kelvin": temp=Kelvin(res);break;
			case "Farengate": temp=Farengate(res);break;
			case "Rankin": temp=Rankin(res);break;
			case "Cels": temp=Cels(res);break;
			case "Demel": temp=Demel(res);break;
			case "Reomur": temp=Reomur(res);break;
			case "Newton": temp=Newton(res);break;
			
			}
			return temp;
		}
		
		static double VolumeOfDistance(double num, String in, String out)
		{
			if(in==null || out==null)
			{
				throw new IllegalArgumentException();
			}
			if(in==out)
			{
				return num;
			}

			double temp=0;
			switch(in)
			{
			case "Miles": temp=1/Miles(1)*num;break;
			case "Yard": temp=1/Yard(1)*num;break;
			case "Phut": temp=1/Phut(1)*num;break;
			case "Sagen": temp=1/Sagen(1)*num;break;
			case "CosoySagen": temp=1/CosoySagen(1)*num;break;
			case "Posoch": temp=1/Posoch(1)*num;break;
			case "Arshin": temp=1/Arshin(1)*num;break;

			}
			
			double res=0;
			switch(out)
			{
			case "Miles":res=Miles(temp);break;
			case "Yard":res=Yard(temp);break;
			case "Phut":res=Phut(temp);break;
			case "Sagen":res=Sagen(temp);break;
			case "CosoySagen":res=CosoySagen(temp);break;
			case "Posoch":res=Posoch(temp);break;
			case "Arshin":res=Arshin(temp);break;
			
			}
			return res;
		}
		static double VolumeOfTime(double num, String in, String out)
		{
			if(in==null || out==null)
			{
				throw new IllegalArgumentException();
			}
			if(in==out)
			{
				return num;
			}

			double temp=0;
			switch(in)
			{
			case "Secunda": temp=(1/Secunda(1))*num;break;
			case "Hour": temp=(1/Hour(1))*num;break;
			case "Days": temp=(1/Days(1))*num;break;
			case "AcademHour": temp=(1/AcademHour(1))*num;break;
			case "AstroHour": temp=(1/AstroHour(1))*num;break;
			case "ParaUniverse": temp=(1/ParaUniverse(1))*num;break;
			case "Milisec": temp=(1/Milisec(1))*num;break;

			}
			
			double res=0;
			switch(out)
			{
			case "Secunda":res=Secunda(temp);break;
			case "Hour":res=Hour(temp);break;
			case "Days":res=Days(temp);break;
			case "AcademHour":res=AcademHour(temp);break;
			case "AstroHour":res=AstroHour(temp);break;
			case "ParaUniverse":res=ParaUniverse(temp);break;
			case "Milisec":res=Milisec(temp);break;
			
			}
			return res;
		}
		static double VolumeOfWeight(double num, String in, String out)
		{
			if(in==null || out==null)
			{
				throw new IllegalArgumentException();
			}
			if(in==out)
			{
				return num;
			}

			double temp=0;
			switch(in)
			{
			case "Stoune": temp=1/Stoune(1)*num;break;
			case "Funt": temp=1/Funt(1)*num;break;
			case "Uncia": temp=1/Uncia(1)*num;break;
			case "Pud": temp=1/Pud(1)*num;break;
			case "Berck": temp=1/Berck(1)*num;break;
			case "Butman": temp=1/Butman(1)*num;break;
			case "Tonna": temp=1/Tonna(1)*num;break;

			}
			
			double res=0;
			switch(out)
			{
			case "Stoune":res=Stoune(temp);break;
			case "Funt":res=Funt(temp);break;
			case "Uncia":res=Uncia(temp);break;
			case "Pud":res=Pud(temp);break;
			case "Berck":res=Berck(temp);break;
			case "Butman":res=Butman(temp);break;
			case "Tonna":res=Tonna(temp);break;
			
			}
			return res;
		}

	

	static double VolumeOfAmount(double num, String in, String out)
	{
		if(in==null || out==null)
		{
			throw new IllegalArgumentException();
		}
		if(in==out)
		{
			return num;
		}


		double temp=0;
		switch(in)
		{
		case "Galon": temp=1/Galon(1)*num;break;
		case "Kvarta": temp=1/Kvarta(1)*num;break;
		case "Pinta": temp=1/Pinta(1)*num;break;
		case "Barrel": temp=1/Barrel(1)*num;break;
		case "Anker": temp=1/Anker(1)*num;break;
		case "Vedro": temp=1/Vedro(1)*num;break;
		case "Shopen": temp=1/Shopen(1)*num;break;

		}
		
		double res=0;
		switch(out)
		{
		case "Barrel":res=Barrel(temp);break;
		case "Galon":res=Galon(temp);break;
		case "Kvarta":res=Kvarta(temp);break;
		case "Pinta":res=Pinta(temp);break;
		case "Anker":res=Anker(temp);break;
		case "Vedro":res=Vedro(temp);break;
		case "Shopen":res=Shopen(temp);break;
		
		}
		return res;
	}

}
