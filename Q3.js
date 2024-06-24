findLongestPalindrome(s) {
    let longest = "";
    for (let i = 0; i < s.length; i++) {
      for (let j = i; j < s.length; j++) {
        const substr = s.slice(i, j + 1);
        if (this.isPalindrome(substr) && substr.length > longest.length) {
          longest = substr;
        }
      }
    }

    return longest;
  },

  isPalindrome(s) {
    return s === s.split('').reverse().join('');
  }