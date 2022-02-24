#include<iostream>
#include<vector>
using namespace std;

vector<int> getFrequencyList(string notes){
    vector<int>freqList(26,0);
    for(int i=0;i<notes.size();++i){
        freqList[notes[i]-'a']++;
    }
    return freqList;
}

int calculateRemovalsCount(string notes){
    vector<int> charFrequencies = getFrequencyList(notes);
    sort(charFrequencies.begin(),charFrequencies.end());
    int removalCount = 0,maxFreqAllowed=INT_MAX;
    for(int i=charFrequencies.size()-1;i>=0;--i){
        if(charFrequencies[i]==0)
            break;
        if(charFrequencies[i]>maxFreqAllowed) {
            removalCount += charFrequencies[i] - max(maxFreqAllowed,0);
            charFrequencies[i]=maxFreqAllowed;
        }
        maxFreqAllowed=min(maxFreqAllowed,charFrequencies[i])-1;
    }
    return removalCount;
}

int main(){
    string notes;
    cin>>notes;
    cout<<calculateRemovalsCount(notes)<<'\n';
    return 0;
}