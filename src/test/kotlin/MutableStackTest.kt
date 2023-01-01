import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Sample()

class MutableStackTest {
    @Test
    fun testSize() {
        val sample = Sample()
        val mutableStack = mutableStackOf(sample)
        assertEquals(1, mutableStack.size())
    }

    @Test
    fun testPush() {
        val sample = Sample()
        val sample2 = Sample()
        val mutableStack = mutableStackOf(sample)
        mutableStack.push(sample2)
        assertEquals(2, mutableStack.size())
    }

    @Test
    fun testPeek() {
        val sample = Sample()
        val mutableStack = mutableStackOf(sample)
        val result = mutableStack.peek()
        assertEquals(sample, result)
    }

    @Test
    fun testPop() {
        val sample = Sample()
        val sample2 = Sample()
        val mutableStack = mutableStackOf(sample, sample2)
        val result = mutableStack.pop()
        assertEquals(1, mutableStack.size())
        assertEquals(sample2, result)
    }

    @Test
    fun testIsEmpty() {
        val sample = Sample()
        val mutableStack = mutableStackOf(sample)
        assertFalse(mutableStack.isEmpty())
        mutableStack.pop()
        assertTrue(mutableStack.isEmpty())

    }

}