#include <iostream>
#include <stdlib.h>
#include<locale>
#include <ctime>
using namespace std;


int main()
{
	setlocale(LC_CTYPE,"russian");
	system("color 1F");

	char answ='E', askS='e', askK = 'E', thousand ='0', vic=4,enter;
	int money=0,bonus=0;
	enum Questions{quest1=1, quest2,quest3, quest4, quest5, quest6, quest7, quest8, quest9, quest10, quest11, quest12, quest13, quest14, quest15	};
	Questions question=quest1;
	short qu= question,num=0, game=1;
	cout << "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" << endl;
	cout << " \t����- ��� ����� ����� �����������" << endl;
	cout << "_______________________________________________________________________________" << endl;
	cout << "\t\t�� ����� � ���� \"��� ����� ����� �����������\" \n" ;
	cout << "\t��� �� ���������� 1.000.000 ������, ���������� �������� �� 5 ��������" << endl;
	cout << "\t� ���� ���� ����������� ����� 250.000 ������" << endl;

	cout << "\t�� ������ ������?" << endl;
	cout << "_______________________________________________________________________________\n" << endl;
	cout << "\t(y ��� n)?" ;
	cin >> enter;
	if (enter == 'y' || enter == 'Y')
	{






		while ((answ == askS || askK == answ) && (game <= 5))//����������� ���������� ����� ������
		{
			system("cls");
			srand(time(0));//����������� �������
			qu = num + ((rand() + rand()) % 3 + 1);//����������� ��� ��������




			cout << "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" << endl;
			cout << " \t����- ��� ����� ����� �����������" << endl;
			cout << "_______________________________________________________________________________" << endl;
			cout << "������ " << game << " �� 5 | ����� ������ �������� : " << money;
			(money != 0) ? (cout << "." << thousand << thousand << thousand << " ������" << endl) : cout << endl;
			cout << "_______________________________________________________________________________\n" << endl;


			switch (qu)//���� ��������
			{
			case quest1:
				num = 3;
				cout << " ���, ��� �������, ������ � ����� ����� ��� ������� ?\n" << endl;
				cout << "\tA : ��������\n\tB : ���������\n\tC : ��������\n\tD : ���������\n" << endl;
				askS = 'b', askK = 'B';//���������� ����������� ���� ������������� ������ ����������� ������ ��������� � ��������� �����
				money = 25;
				break;

			case quest2:
				num = 3;
				cout << " ��� ������ ������� � ������� ��������� �������� ?\n" << endl;
				cout << "\tA : �����\n\tB : ������\n\tC : �����\n\tD : �����\n" << endl;
				askS = 'b', askK = 'B';//���������� ����������� ���� ������������� ������ ����������� ������ ��������� � ��������� �����	
				money = 25;
				break;

			case quest3:
				num = 3;
				cout << " ��� ��������� ��������� ��������� : \n\t\"�� ���������� �� ������ ��, ��� �����...\" ?\n" << endl;
				cout << "\tA : ������� �������\n\tB : ������� �����������\n\tC : ������� ����� �����\n\tD : ������� �� ������\n" << endl;
				askS = 'a', askK = 'A';//���������� ����������� ���� ������������� ������ ����������� ������ ��������� � ��������� �����
				money = 25;
				break;

			case quest4:
				num = 6;
				cout << " ��� ��������� �������, ������� �������� ���� ������ � ��������� ���������� ��������� ?\n" << endl;
				cout << "\tA : \"����� ���������\"\n\tB : \"������� ��������\"\n\tC : \"������ ������\"\n\tD : \"��� �������\"\n" << endl;
				askS = 'd', askK = 'D';//���������� ����������� ���� ������������� ������ ����������� ������ ��������� � ��������� �����
				break;

			case quest5:
				num = 6;
				cout << " ������ ������ �������� ����� ����� �������� ���������� �������� ?\n" << endl;
				cout << "\tA : �������\n\tB : �������\n\tC : ������\n\tD : ������\n" << endl;
				askS = 'd', askK = 'D';//���������� ����������� ���� ������������� ������ ����������� ������ ��������� � ��������� �����
				break;

			case quest6:
				num = 6;
				cout << " ������ ���� ������� �� ���������� ?\n" << endl;
				cout << "\tA : �����������\n\tB : ������������\n\tC : ���������������\n\tD : ����������\n" << endl;
				askS = 'a', askK = 'A';//���������� ����������� ���� ������������� ������ ����������� ������ ��������� � ��������� �����
				break;

			case quest7:
				num = 9;
				cout << " ������ - ���������� ����� ������ ��� ������� �������� ��������� ?\n" << endl;
				cout << "\tA : ����������\n\tB : ���������\n\tC : ��� � �����\n\tD : ������\n" << endl;
				askS = 'c', askK = 'C';//���������� ����������� ���� ������������� ������ ����������� ������ ��������� � ��������� �����
				break;

			case quest8:
				num = 9;
				cout << "\a ������ ���� � ��� �������� ������������� ?\n" << endl;
				cout << "\tA : �������\n\tB : �������������\n\tC : ����������� �� ��������\n\tD : ������ ������\n" << endl;
				askS = 'a', askK = 'A';//���������� ����������� ���� ������������� ������ ����������� ������ ��������� � ��������� �����
				break;

			case quest9:
				num = 9;
				cout << " ������ ������� �� ���� � ���������� ����� ������� ?\n" << endl;
				cout << "\tA : \"��������\"\n\tB : \"��������\"\n\tC : \"������������\"\n\tD : \"��������������\"\n" << endl;
				askS = 'd', askK = 'D';//���������� ����������� ���� ������������� ������ ����������� ������ ��������� � ��������� �����
				break;

			case quest10:
				num = 12;
				cout << " �� ������� ����� ������ ������ ���������� ���� ������ ?\n" << endl;
				cout << "\tA : ������\n\tB : ��������\n\tC : �������\n\tD : ������\n" << endl;
				askS = 'd', askK = 'D';//���������� ����������� ���� ������������� ������ ����������� ������ ��������� � ��������� �����
				bonus = money;
				break;

			case quest11:
				num = 12;
				cout << " ��� � ������� ������ ����� ���� ������� ������� :\n\t \"����� ����� ������� � ������� �����\" ?\n" << endl;
				cout << "\tA : �� ���������\n\tB : � ���������\n\tC : � �����������\n\tD : � �������\n" << endl;
				askS = 'c', askK = 'C';//���������� ����������� ���� ������������� ������ ����������� ������ ��������� � ��������� �����
				bonus = money;
				break;

			case quest12:
				num = 12;
				cout << " ������ ������ �� ���������� ?\n" << endl;
				cout << "\tA : ����������\n\tB : ����������\n\tC : ���������\n\tD : �������������\n" << endl;
				askS = 'c', askK = 'C';//���������� ����������� ���� ������������� ������ ����������� ������ ��������� � ��������� �����
				bonus = money;
				break;

			case quest13:
				cout << " ��� � ����� XVII ���� ������� ���������� �� ���������� ����������� ������ ?\n" << endl;
				cout << "\tA : ��������� �����\n\tB : �������� �����\n\tC : �������� ��������\n\tD : �������� ������\n" << endl;
				askS = 'a', askK = 'A';//���������� ����������� ���� ������������� ������ ����������� ������ ��������� � ��������� �����
				break;

			case quest14:
				cout << " � ����� ������ ��� �������� ������� \"�����\" \n" << endl;
				cout << "\tA : ������\n\tB : ��������\n\tC : ����������\n\tD : ��������������\n" << endl;
				askS = 'd', askK = 'D';//���������� ����������� ���� ������������� ������ ����������� ������ ��������� � ��������� �����
				break;

			case quest15:
				cout << " ����� ���� ����������������, ���� ������ ��������, ������������ ��� �������� ������ ?\n" << endl;
				cout << "\tA : �������\n\tB : �������\n\tC : �� ++\n\tD : ��������\n" << endl;
				askS = 'a', askK = 'A';//���������� ����������� ���� ������������� ������ ����������� ������ ��������� � ��������� �����
				break;

			default:

				break;
			}
			(money == 100) ? money = 250 : money = money * 2;//�����
			cout << "����� ����������� ������ ���� ����� �����: " << money << "." << thousand << thousand << thousand << " ������" << endl;;
			cout << "������� ����� ����������� ������: ";
			cin >> answ;
			++game;




		}

		if (answ == askS || askK == answ)//��� ������
		{
			system("cls");
			system("color 1F");

			cout << "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" << endl;
			cout << " \t����- ��� ����� ����� �����������" << endl;
			cout << "_______________________________________________________________________________\n" << endl;
			cout << "\t  " << vic << vic << vic << "  " << vic << vic << vic << "  " << vic << vic << vic << "  " << vic << vic << vic << "  " << " " << vic << vic << "  " << " " << vic << " " << "  " << vic << endl;
			cout << "\t  " << vic << " " << vic << "  " << vic << " " << vic << "  " << vic << " " << " " << "  " << vic << " " << " " << "  " << vic << " " << vic << "  " << vic << " " << vic << "  " << vic << endl;
			cout << "\t  " << vic << " " << vic << "  " << vic << " " << vic << "  " << vic << vic << " " << "  " << vic << vic << vic << "  " << vic << " " << vic << "  " << vic << vic << vic << "  " << vic << endl;
			cout << "\t  " << vic << " " << vic << "  " << vic << " " << vic << "  " << vic << " " << vic << "  " << vic << " " << " " << " " << vic << vic << vic << vic << vic << " " << vic << " " << vic << endl;
			cout << "\t  " << vic << " " << vic << "  " << vic << vic << vic << "  " << vic << vic << vic << "  " << vic << vic << vic << " " << vic << "   " << vic << " " << vic << " " << vic << "  " << vic << endl;

			cout << "\n�� ����� ����������� � ���� ��� ����� ����� �����������! \n";
			cout << "\n\t�����������! \n";
			cout << "\n\t\t�� �������� : ";
			(money != 1000) ? (cout << money) : (cout << 1 << "." << thousand << thousand << thousand);
			cout << "." << thousand << thousand << thousand << " ������\n" << endl;

		}
		else//��� ���������
		{
			money = money - money + bonus;
			--game;
			system("cls");
			system("color C0");


			cout << "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\a\a\a\a\a" << endl;
			cout << " \t����- ��� ����� ����� �����������" << endl;
			cout << "_______________________________________________________________________________" << endl;
			cout << "������ " << game << " �� 5 | ����� ������ �������� : " << money;
			(money != 0) ? (cout << "." << thousand << thousand << thousand << " ������" << endl) : cout << endl;
			cout << "_______________________________________________________________________________\n" << endl;




			switch (qu)//��� ������������ ����������� ������
			{
			case quest1:
				num = 3;
				cout << " ���, ��� �������, ������ � ����� ����� ��� ������� ?\n" << endl;
				cout << "\tA : ��������\n\tB : ���������\n\tC : ��������\n\tD : ���������\n" << endl;
				askS = 'b', askK = 'B';//���������� ����������� ���� ������������� ������ ����������� ������ ��������� � ��������� �����

				break;
			case quest2:
				num = 3;
				cout << " ��� ������ ������� � ������� ��������� �������� ?\n" << endl;
				cout << "\tA : �����\n\tB : ������\n\tC : �����\n\tD : �����\n" << endl;
				askS = 'b', askK = 'B';//���������� ����������� ���� ������������� ������ ����������� ������ ��������� � ��������� �����	


				break;
			case quest3:
				num = 3;
				cout << " ��� ��������� ��������� ��������� : \n\t\"�� ���������� �� ������ ��, ��� �����...\" ?\n" << endl;
				cout << "\tA : ������� �������\n\tB : ������� �����������\n\tC : ������� ����� �����\n\tD : ������� �� ������\n" << endl;
				askS = 'a', askK = 'A';//���������� ����������� ���� ������������� ������ ����������� ������ ��������� � ��������� �����
				break;
			case quest4:
				num = 6;
				cout << " ��� ��������� �������, ������� �������� ���� ������ � ��������� ���������� ��������� ?\n" << endl;
				cout << "\tA : \"����� ���������\"\n\tB : \"������� ��������\"\n\tC : \"������ ������\"\n\tD : \"��� �������\"\n" << endl;
				askS = 'd', askK = 'D';//���������� ����������� ���� ������������� ������ ����������� ������ ��������� � ��������� �����
				break;
			case quest5:
				num = 6;
				cout << " ������ ������ �������� ����� ����� �������� ���������� �������� ?\n" << endl;
				cout << "\tA : �������\n\tB : �������\n\tC : ������\n\tD : ������\n" << endl;
				askS = 'd', askK = 'D';//���������� ����������� ���� ������������� ������ ����������� ������ ��������� � ��������� �����
				break;
			case quest6:
				num = 6;
				cout << " ������ ���� ������� �� ���������� ?\n" << endl;
				cout << "\tA : �����������\n\tB : ������������\n\tC : ���������������\n\tD : ����������\n" << endl;
				askS = 'a', askK = 'A';//���������� ����������� ���� ������������� ������ ����������� ������ ��������� � ��������� �����
				break;
			case quest7:
				num = 9;
				cout << " ������ - ���������� ����� ������ ��� ������� �������� ��������� ?\n" << endl;
				cout << "\tA : ����������\n\tB : ���������\n\tC : ��� � �����\n\tD : ������\n" << endl;
				askS = 'c', askK = 'C';//���������� ����������� ���� ������������� ������ ����������� ������ ��������� � ��������� �����
				break;
			case quest8:
				num = 9;
				cout << "\a ������ ���� � ��� �������� ������������� ?\n" << endl;
				cout << "\tA : �������\n\tB : �������������\n\tC : ����������� �� ��������\n\tD : ������ ������\n" << endl;
				askS = 'a', askK = 'A';//���������� ����������� ���� ������������� ������ ����������� ������ ��������� � ��������� �����
				break;
			case quest9:
				num = 9;
				cout << " ������ ������� �� ���� � ���������� ����� ������� ?\n" << endl;
				cout << "\tA : \"��������\"\n\tB : \"��������\"\n\tC : \"������������\"\n\tD : \"��������������\"\n" << endl;
				askS = 'd', askK = 'D';//���������� ����������� ���� ������������� ������ ����������� ������ ��������� � ��������� �����
				break;
			case quest10:
				num = 12;
				cout << " �� ������� ����� ������ ������ ���������� ���� ������ ?\n" << endl;
				cout << "\tA : ������\n\tB : ��������\n\tC : �������\n\tD : ������\n" << endl;
				askS = 'd', askK = 'D';//���������� ����������� ���� ������������� ������ ����������� ������ ��������� � ��������� �����
				break;
			case quest11:
				num = 12;
				cout << " ��� � ������� ������ ����� ���� ������� ������� :\n\t \"����� ����� ������� � ������� �����\" ?\n" << endl;
				cout << "\tA : �� ���������\n\tB : � ���������\n\tC : � �����������\n\tD : � �������\n" << endl;
				askS = 'c', askK = 'C';//���������� ����������� ���� ������������� ������ ����������� ������ ��������� � ��������� �����
				break;
			case quest12:
				num = 12;
				cout << " ������ ������ �� ���������� ?\n" << endl;
				cout << "\tA : ����������\n\tB : ����������\n\tC : ���������\n\tD : �������������\n" << endl;
				askS = 'c', askK = 'C';//���������� ����������� ���� ������������� ������ ����������� ������ ��������� � ��������� �����
				break;
			case quest13:

				cout << " ��� � ����� XVII ���� ������� ���������� �� ���������� ����������� ������ ?\n" << endl;
				cout << "\tA : ��������� �����\n\tB : �������� �����\n\tC : �������� ��������\n\tD : �������� ������\n" << endl;
				askS = 'a', askK = 'A';//���������� ����������� ���� ������������� ������ ����������� ������ ��������� � ��������� �����
				break;
			case quest14:
				cout << " � ����� ������ ��� �������� ������� \"�����\" \n" << endl;
				cout << "\tA : ������\n\tB : ��������\n\tC : ����������\n\tD : ��������������\n" << endl;
				askS = 'd', askK = 'D';//���������� ����������� ���� ������������� ������ ����������� ������ ��������� � ��������� �����
				break;
			case quest15:
				cout << " ����� ���� ����������������, ���� ������ ��������, ������������ ��� �������� ������ ?\n" << endl;
				cout << "\tA : �������\n\tB : �������\n\tC : �� ++\n\tD : ��������\n" << endl;
				askS = 'a', askK = 'A';//���������� ����������� ���� ������������� ������ ����������� ������ ��������� � ��������� �����
				break;
			default:

				break;
			}
			cout << "\t�� ���������!!! \n" << endl;
			cout << "�� ��������: " << answ << "    ���������� ����� �� ������: " << askK << endl;

			(money == 250) ? (cout << "\n\t�� ��������: " << money << "." << thousand << thousand << thousand << " ������\n" << endl) : cout << "\n�� ������ �� ��������!\n" << endl;//���������� ����� ��������

		}
	}



	system("pause");
	return 0;
}