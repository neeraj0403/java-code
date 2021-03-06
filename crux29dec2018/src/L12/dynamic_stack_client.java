package L12;

public class dynamic_stack_client {

	public static void main(String[] args) throws Exception {
		dynamic_stack ds = new dynamic_stack();
		dynamic_stack helper = new dynamic_stack();
		ds.push(10);
		ds.push(200);
		ds.push(300);
		ds.push(400);
		ds.push(400);
		ds.push(400);
		ds.push(400);

		ds.display();
		// displayreverse(ds);
		//displayactualrverse(ds, helper);
		//ds.display();
		int arr[] = { 20, 30, 10, 40, 60, 80 };
//		//int ans[] = nextgreater(arr);
//		for (int i = 0; i < ans.length; i++) {
//			System.out.print(ans[i] + " ");
//		}
	}

	public static void displayreverse(dynamic_stack s) throws Exception {
		if (s.isempty())

			return;
		int temp = s.pop();
		System.out.println(temp);

		displayreverse(s);
		s.push(temp);

	}

	public static void displayactualrverse(dynamic_stack s, dynamic_stack helper) throws Exception {
		if (s.isempty()) {
			if (helper.isempty())

			{
				return;
			}
			int temph = helper.pop();
			displayactualrverse(s, helper);
			s.push(temph);
			return;

		}

		int temp = s.pop();
		helper.push(temp);
		displayactualrverse(s, helper);

	}

	public static int[] nextgreater(int[] arr) throws Exception {
		dynamic_stack ns = new dynamic_stack();
		int ans[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			while (!ns.isempty() && arr[ns.peek()] < arr[i]) {
				ans[ns.pop()] = arr[i];
			}

			ns.push(i);
		}
		while (!ns.isempty()) {
			ans[ns.pop()] = -1;
		}
		return ans;
	}

	public static int[] stock(int[] arr) throws Exception {
		dynamic_stack ns = new dynamic_stack();
		int ans[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			while (ns.isempty() && arr[ns.peek()] < arr[i]) {
				ns.peek();
			}
			if (ns.isempty()) {
				ans[i] = i + 1;
			} else {
				ans[i] = ns.peek() - i;
			}

			ns.push(i);
		}
   return arr;
	}
}
