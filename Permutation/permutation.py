# Display all the permutations of a given string
# For a string with 'n' characters, there are n! permutations
# 
# Number of permutations = n! / (n-r)!
# n = number of characters
# r = number of characters used at the same time
# 
# In our case, r = n, hence the number of permutations is n!
#


# The idea here is that, there are 'n' slots
# We assign one of the n characters to a slot and then 
# try to assign one of the n-1 characters to next slot 
# and so on.
def permutations(s, prefix) -> None:
    if(len(s) == 0):
        print(prefix)

    for i in range(len(s)):
        permutations(s[0:i]+s[i+1:], prefix+s[i])


if __name__ == '__main__':
    permutations("abcd", "")