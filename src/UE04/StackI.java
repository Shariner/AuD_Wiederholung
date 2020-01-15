// Abstrakte Datenstruktur Stack, realisiert als Java-Interface
package UE04;
interface StackI<E>
{
	public void push(E element);
	public void pop();
	public E top();
	public boolean isEmpty();
}
