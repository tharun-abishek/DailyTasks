package org.task1.zsgs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import java.util.Stack;

public class ChatBot {

	private Stack<Integer> stacklist = new Stack<>();
	static int level = 0;
	static int previous = 0;

	void initial() {
		System.out.println("Welcome to E-Commerce ChatBot");
		int option;
		stacklist.push(level);
		getUserOption(level, 0);
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println();
			System.out.println("Enter your option: ");
			option = sc.nextInt();
			if (option == 9) {
				stacklist.pop();
				level--;
				if (stacklist.isEmpty()) {
					break;
				}
			} else {
				level++;
				stacklist.push(level);

			}
			getUserOption(level, option);
		} while (option != 0);
		System.out.println("Thank you!!!");
	}

	void getUserOption(int categoryLevel, int options) {
		Connection con = null;
		Statement smt = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zsgs", "root", "password199");
			smt = con.createStatement();
			if (categoryLevel == 0) {
				String query = "select * from level_0";
				ResultSet rs = smt.executeQuery(query);
				while (rs.next()) {
					int id = rs.getInt(1);
					String option1 = rs.getString(2);

					System.out.println(id + "." + option1);
				}
				System.out.println("0.exit");

			}

			else if (categoryLevel == 1) {
				if (options != 9) {
					previous = options;
				}

				String query = "select * from level_1 where id=" + previous;
				ResultSet rs = smt.executeQuery(query);
				int num = 1;
				while (rs.next()) {
					int id_1 = rs.getInt(1);
					String option = rs.getString(2);

					System.out.println(num++ + "." + option);
				}
				System.out.println("9.back\n0.exit");

			}

			else if (categoryLevel == 2) {

				String query = "select * from level_2 where id_1=" + options + " and previous=" + previous;
				ResultSet rs = smt.executeQuery(query);
				int num = 1;
				while (rs.next()) {
					int id = rs.getInt(1);
					String option = rs.getString(2);

					System.out.println(num++ + "." + option);
				}
				System.out.println("9.back\n0.exit");
			} else if (categoryLevel == 3) {
				System.out.println("Our customer support will reach you soon!!");
				System.out.println("9.back\n0.exit");
			}

		}

		catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				con.close();
				smt.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public static void main(String[] args) {
		ChatBot cb = new ChatBot();
		cb.initial();
	}
}
