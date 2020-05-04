class Solution:
    def findComplement(self, num: int) -> int:
        i = bin(num)[2:]		#convert to binary(format=> 0b101 for 5) [2:]=> remove the 0b
        d = {'0':'1','1':'0'}		#use dict for one's complement
        l = ''.join(d[j] for j in i)	
        return int(l,2)			#return the binary number to decimal(l,2)=> 2 specify the base(binary has base 2)
        				#int() => convert only string format number